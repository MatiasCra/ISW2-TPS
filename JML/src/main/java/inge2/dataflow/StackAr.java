package inge2.dataflow;

public class StackAr {
    //@ public invariant top >= -1;
    //@ public invariant top < elems.length;

    /**
     * Capacidad por defecto de la pila.
     */
    //@ spec_public
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    //@ spec_public
    private final int[] elems;

    /**
     * Indice del tope de la pila.
     */
    //@ spec_public
    private int top = -1;

    //@ ensures elems.length == DEFAULT_CAPACITY && top == -1;
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ requires capacity > 0;
    //@ ensures elems.length == capacity && top == -1;
    public StackAr(int capacity) {
        this.elems = new int[capacity];
    }

    //@ ensures \result == true <==> top == -1;
    public boolean isEmpty() {
        return this.top == -1;
    }

    //@ ensures \result == true <==> top == elems.length - 1;
    public boolean isFull() {
        return this.top == this.elems.length - 1;
    }

    //@ ensures \result == top + 1;
    public int size() {
        return top + 1;
    }

    //@ requires top < elems.length - 1;
    //@ ensures top == \old(top) + 1;
    //@ ensures elems[top] == o;
    //@ ensures \forall int k; 0 <= k && k < top; elems[k] == \old(elems[k]);
    public void push(int o) {
        top += 1;
        elems[top] = o;
    }

    //@ requires top >= 0;
    //@ ensures \result == \old(elems[top]);
    //@ ensures top == \old(top) - 1;
    //@ ensures \forall int k; 0 <= k && k <= top; elems[k] == \old(elems[k]);
    public int pop() {
        int temp = elems[top];
        top -= 1;
        return temp;
    }

    //@ requires top >= 0;
    //@ ensures \result == elems[top];
    //@ ensures top == \old(top);
    //@ ensures \forall int k; 0 <= k && k <= top; elems[k] == \old(elems[k]);
    public int peek() {
        return elems[top];
    }
}

