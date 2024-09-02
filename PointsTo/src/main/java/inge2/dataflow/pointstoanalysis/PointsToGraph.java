package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.jimple.AssignStmt;
import soot.tagkit.LineNumberTag;

import java.util.*;

public class PointsToGraph {

    /**
     * Nodos del grafo.
     * <p>
     * Cada nodo representa todos los objetos creados por cada sentencia "new".
     * Es decir, tenemos un nodo por cada "new" en el programa.
     */
    public Set<Node> nodes;

    /**
     * Ejes del grafo.
     * <p>
     * Un eje (n1, f, n2) indica que el los objetos representados por el nodo n1 tienen un campo f que apunta al/los
     * objetos representados por n2.
     */
    public Set<Axis> axis;

    /**
     * Mapping de variables locales a nodos.
     * Representa el conjunto de objetos a los que puede apuntar una variable local.
     */
    public Map<String, Set<Node>> mapping;

    public PointsToGraph() {
        nodes = new HashSet<>();
        axis = new HashSet<>();
        mapping = new HashMap<>();
    }

    public void clear() {
        nodes.clear();
        axis.clear();
        mapping.clear();
    }

    /**
     * Devuelve el nombre del nodo correspondiente a la sentencia <code>stmt</code>.
     *
     * @param stmt
     * @return
     */
    public Node getNodeName(AssignStmt stmt) {
        LineNumberTag lineNumberTag = (LineNumberTag) stmt.getTag("LineNumberTag");
        return new Node(String.valueOf(lineNumberTag.getLineNumber()));
    }

    /**
     * Devuelve el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     *
     * @param variableName
     * @return
     */
    public Set<Node> getNodesForVariable(String variableName) {
        return this.mapping.get(variableName);
    }

    /**
     * Setea el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     *
     * @param variableName
     * @param nodes
     */
    public void setNodesForVariable(String variableName, Set<Node> nodes) {
        this.mapping.put(variableName, nodes);
    }

    /**
     * Agrega un eje al grafo.
     *
     * @param leftNode
     * @param fieldName
     * @param rightNode
     */
    public void addEdge(Node leftNode, String fieldName, Node rightNode) {
        this.axis.add(new Axis(leftNode, fieldName, rightNode));
    }

    /**
     * Devuelve el conjunto de nodos alcanzables desde el nodo <code>node</code> por el campo <code>fieldName</code>.
     *
     * @param node
     * @param fieldName
     * @return
     */
    public Set<Node> getReachableNodesByField(Node node, String fieldName) {
        Set<Node> reachable = new HashSet<>();
        for (Axis axis : this.axis) {
            if (axis.leftNode == node && Objects.equals(axis.fieldName, fieldName)) {
                reachable.add(axis.rightNode);
            }
        }
        return reachable;
    }

    /**
     * Copia de un grafo (modifica el this).
     *
     * @param in
     */
    public void copy(PointsToGraph in) {
        this.clear();
        this.union(in);
    }

    /**
     * Union de dos grafos (modifica el this).
     * this = this U in
     * Recordar que hay que unir:
     * los nodos, los ejes y el supermo mapping de variables a nodos
     *
     * @param in el grafo a unir
     */
    public void union(PointsToGraph in) {
        this.nodes.addAll(in.nodes);
        this.axis.addAll(in.axis);
        for (String variableName : in.mapping.keySet()) {
            if (!this.mapping.containsKey(variableName)) {
                this.mapping.put(variableName, new HashSet<>());
            }
            for (Node n : in.getNodesForVariable(variableName)) {
                this.mapping.get(variableName).add(n);
            }
        }
    }
}