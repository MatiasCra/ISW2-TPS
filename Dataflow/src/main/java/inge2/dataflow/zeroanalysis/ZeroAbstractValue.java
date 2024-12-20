package inge2.dataflow.zeroanalysis;

import soot.dava.toolkits.base.AST.transformations.UselessLabelFinder;

import java.util.HashMap;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is not zero.
     */
    NOT_ZERO("not-zero"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable may be (or not) zero.
     */
    MAYBE_ZERO("maybe-zero");

    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     *
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        if (this == BOTTOM || another == BOTTOM) return BOTTOM;
        if (this == ZERO) return another;
        if (this == NOT_ZERO) {
            if (another == ZERO) return NOT_ZERO;
            if (another == NOT_ZERO || another == MAYBE_ZERO) return MAYBE_ZERO;
        }

        return MAYBE_ZERO;
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     *
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        if (this == BOTTOM || another == BOTTOM) return BOTTOM;
        if (another == ZERO) return BOTTOM;
        if (this == ZERO) return ZERO;
        if (this == NOT_ZERO) {
            if (another == NOT_ZERO) return NOT_ZERO;
            if (another == MAYBE_ZERO) return MAYBE_ZERO;
        }

        return MAYBE_ZERO;
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     *
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        if (this == BOTTOM || another == BOTTOM) return BOTTOM;
        if (this == ZERO || another == ZERO) return ZERO;
        if (this == MAYBE_ZERO || another == MAYBE_ZERO) return MAYBE_ZERO;
        return NOT_ZERO;
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     *
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue subtract(ZeroAbstractValue another) {
        return this.add(another);
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     *
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        return another;
    }

}
