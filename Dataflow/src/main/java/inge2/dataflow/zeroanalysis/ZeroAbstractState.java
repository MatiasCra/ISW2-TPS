package inge2.dataflow.zeroanalysis;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents a mapping of ZeroAbstractValues (BOTTOM, NZ, Z or MZ) to variable names.
 */
public class ZeroAbstractState {

    /**
     * This map contains the mapping of variable names to ZeroAbstractValues.
     */
    private final HashMap<String, ZeroAbstractValue> map;

    public ZeroAbstractState() {
        this.map = new HashMap<>();
    }

    /**
     * This method checks if the given variable has a value in the state.
     *
     * @param variable the variable name.
     * @return true if the variable has a value, false otherwise.
     */
    public Boolean hasValue(String variable) {
        return this.map.containsKey(variable);
    }

    /**
     * This method returns the value of the given variable.
     *
     * @param variable the variable name.
     * @return the value of the variable.
     */
    public ZeroAbstractValue getValue(String variable) {
        return this.map.get(variable);
    }

    /**
     * This method sets the value of the given variable.
     *
     * @param variable the variable name.
     * @param value    the value of the variable.
     */
    public void setValue(String variable, ZeroAbstractValue value) {
        if (value != null) {
            this.map.put(variable, value);
        }
    }

    /**
     * This method returns the defined variables in this mapping.
     *
     * @return the defined variables in this mapping.
     */
    public Set<String> getDefinedVariables() {
        return this.map.keySet();
    }

    /**
     * This method returns the union of this state with another state.
     *
     * @param another the other state.
     * @return the union of this state with another state.
     */
    public ZeroAbstractState union(ZeroAbstractState another) {
        ZeroAbstractState result = new ZeroAbstractState();
        result.putAll(this);
        for (String var : another.getDefinedVariables()) {
            if (this.hasValue(var)) {
                ZeroAbstractValue curr = this.getValue(var);
                ZeroAbstractValue other = another.getValue(var);
                if (curr != other) {
                    if (other == ZeroAbstractValue.MAYBE_ZERO || ((curr == ZeroAbstractValue.ZERO && other == ZeroAbstractValue.NOT_ZERO) || (curr == ZeroAbstractValue.NOT_ZERO && other != ZeroAbstractValue.ZERO))) {
                        result.setValue(var, ZeroAbstractValue.MAYBE_ZERO);
                    } else if (curr == ZeroAbstractValue.BOTTOM) {
                        result.setValue(var, other);
                    }
                }
            } else {
                result.setValue(var, another.getValue(var));
            }
        }
        return result;
    }

    /**
     * Clears the state.
     */
    public void clear() {
        this.map.clear();
    }

    /**
     * Copies the values of another state into this state.
     *
     * @param another the other state.
     */
    public void putAll(ZeroAbstractState another) {
        this.map.putAll(another.map);
    }

    @Override
    public String toString() {
        return "ZeroAbstractState{" + this.map + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZeroAbstractState)) return false;
        ZeroAbstractState that = (ZeroAbstractState) o;
        return Objects.equals(this.map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.map);
    }
}
