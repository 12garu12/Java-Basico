package com.company;

import java.util.*;

public class Main {

    /*
    Esta es una tarea de demostración.

Escribe una función:
class Solution {solución pública int (int [] A); }
que, dada una matriz A de N enteros, devuelve el entero positivo más pequeño (mayor que 0) que no ocurre en A.
Por ejemplo, dado A = [1, 3, 6, 4, 1, 2], la función debería devolver 5.
Dado A = [1, 2, 3], la función debería devolver 4.
Dado A = [−1, −3], la función debería devolver 1.
Escriba un algoritmo eficiente para las siguientes suposiciones:
N es un número entero dentro del rango [ 1 .. 100.000 ];
cada elemento de la matriz A es un número entero dentro del rango [ -1,000,000 .. 1,000,000 ].
Copyright 2009-2021 de Codility Limited. Reservados todos los derechos. Prohibida la copia, publicación o divulgación no autorizadas.
    * */

    /*public int solution(int[] A) {

        Integer[] primerInteger = Arrays.stream(A).boxed().toArray( Integer[]::new );
        Set<Integer> set1 = new HashSet<>(Arrays.asList(primerInteger));
        Set<Integer> set2 = new HashSet<>();

        set1.stream().min(Comparator.naturalOrder());


    }*/


    public static void main(String[] args) {
	// write your code here

        int[] arr = { 0, 1, 2, 3, 4, 5 };

        Integer[] primerInteger = Arrays.stream(arr).boxed().toArray( Integer[]::new );
        Set<Integer> set1 = new HashSet<>(Arrays.asList(primerInteger));
        Set<Integer> set2 = new HashSet<>();

        String num = set1.stream().min(Comparator.naturalOrder()).toString();
        String num2 = set1.stream().max(Comparator.naturalOrder()).toString();
        String[] n = num.split("");
        Integer ss = Integer.parseInt(num);

     /*   for (int i = 0; i < num.length(); i++) {
            if(Integer.parseInt(n[i])){

            }
        }*/

        System.out.println(n);
        System.out.println(num2);







    }
}
