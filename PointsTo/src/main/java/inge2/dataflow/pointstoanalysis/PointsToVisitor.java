package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processCopy(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processStore(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processLoad(stmt);
        }
    }

    private void processNewObject(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        Node nodeName = pointsToGraph.getNodeName(stmt);

        Set<Node> new_map = new HashSet<>();
        new_map.add(nodeName);
        pointsToGraph.setNodesForVariable(leftVariableName, new_map);
    }

    private void processCopy(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        pointsToGraph.setNodesForVariable(leftVariableName, pointsToGraph.getNodesForVariable(rightVariableName));
    }

    private void processStore(AssignStmt stmt) { // x.f = y
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        for (Node left_node : pointsToGraph.getNodesForVariable(leftVariableName)) {
            for (Node right_node : pointsToGraph.getNodesForVariable(rightVariableName)) {
                pointsToGraph.addEdge(left_node, fieldName, right_node);
            }
        }
    }

    private void processLoad(AssignStmt stmt) { // x = y.f
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        Set<Node> right_nodes = pointsToGraph.getNodesForVariable(rightVariableName);
        Set<Node> right_fields = new HashSet<>();
        for (Node node : right_nodes) {
            right_fields.addAll(pointsToGraph.getReachableNodesByField(node, fieldName));
        }
        pointsToGraph.setNodesForVariable(leftVariableName, right_fields);
    }
}
