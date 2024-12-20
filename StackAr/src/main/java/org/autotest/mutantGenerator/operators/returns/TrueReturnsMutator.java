package org.autotest.mutantGenerator.operators.returns;

import org.autotest.mutantGenerator.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#TRUE_RETURNS
 * <p>
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por true.
 */
public class TrueReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // call super method to check if the candidate is not part of randoop.CheckRep: repOK method
        if (!super.isToBeProcessed(candidate)) {
            return false;
        }

        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn) candidate;
        String type = getReturnedExpressionType(op);
        List<String> targetTypes = Arrays.asList("boolean");

        if (!targetTypes.contains(type)) {
            return false;
        }
        CtExpression e = op.getReturnedExpression();
        return !e.toString().equals("true");
    }

    @Override
    public void process(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        op.setReturnedExpression(getEmptyValueForReturnExpression(op));
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    private CtExpression getEmptyValueForReturnExpression(CtReturn op) {
        return op.getFactory().Code().createLiteral(true);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " + op.getReturnedExpression().toString() + " por " + getEmptyValueForReturnExpression(op).toString() + " en la línea " + op.getPosition().getLine() + ".";
    }
}
