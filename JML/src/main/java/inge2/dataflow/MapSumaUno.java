package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //@ requires \forall int n; 0 <= n && n < arr.length; arr[n] < Integer.MAX_VALUE;
    //@ ensures \forall int n; 0 <= n && n < arr.length; arr[n] == (\old(arr[n]) + 1);
    public static void mapSumaUno(int[] arr) {
        //@ maintaining 0 <= i <= arr.length;
        //@ maintaining \forall int n; 0 <= n && n < arr.length; (n < i && arr[n] == (\old(arr[n]) + 1)) || (n >= i && arr[n] == \old(arr[n]));
        //@ loop_writes i, arr[*];
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}