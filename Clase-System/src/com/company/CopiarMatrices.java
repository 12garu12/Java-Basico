package com.company;

public class CopiarMatrices {
    /*
    Copiar matrices
    System.arraycopy es una forma antigua de copiar una matriz en otra.
    Principalmente, arraycopy tiene como objetivo copiar una matriz completa en otra matriz:
    */
    public static void main(String[] args) {

        int[] a = {34, 22, 44, 2, 55, 3};
        int[] b = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(b);
/*
Sin embargo, podemos especificar la posición inicial para ambas matrices, así como cuántos elementos copiar.

Por ejemplo, supongamos que queremos copiar 2 elementos de una , a partir de un [1] a b , a partir de b [3] :

System.arraycopy(a, 1, b, 3, 2);
assertArrayEquals(new int[] {0, 0, 0, 22, 44, 0}, b);
Además, recuerde que arraycopy arrojará:

NullPointerException si cualquiera de las matrices es nula
IndexOutOfBoundsException si la copia hace referencia a cualquier matriz más allá de su rango
ArrayStoreException si la copia da como resultado una falta de coincidencia de tipos
*/
    }
}
