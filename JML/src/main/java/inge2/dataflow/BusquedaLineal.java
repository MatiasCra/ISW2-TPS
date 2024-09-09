package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ ensures \result == false || (\result == true && (\exists int k; 0 <= k && k < arr.length; arr[k] == elem));
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        //@ maintaining 0 <= i <= arr.length;
        //@ maintaining result == true <==> \exists int n; 0 <= n && n < i; elem == arr[n];
        //@ loop_writes result, i;
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                //@ assert elem == arr[i];
                result = true;
            }
        }

        return result;
    }
}