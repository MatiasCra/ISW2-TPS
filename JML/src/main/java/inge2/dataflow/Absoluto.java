package inge2.dataflow;

public class Absoluto {

    // Calcula el valor absoluto de un número entero.
    // Si el número es negativo, devuelve el opuesto.
    //
    //@ requires Integer.MIN_VALUE < n && n <= Integer.MAX_VALUE;
    //@ ensures (n >= 0 && \result == n) || (n < 0 && \result == -n);
    public static int valorAbsoluto(int n) {
        if (n < 0) {
            //@ assert n < 0;
            return -n;
        } else {
            //@ assert n >= 0;
            return n;
        }
    }
}