package com.company;


/**************************************************************************************************************
 En Java, también es posible anidar clases (una clase dentro de una clase). El propósito de las clases anidadas
 es agrupar las clases que pertenecen juntas, lo que hace que su código sea más legible y fácil de mantener.
 Para acceder a la clase interna, cree un objeto de la clase externa y luego cree un objeto de la clase interna:
 */

public class OuterClass {

    int x = 10;

    class InnerClass {

        int y = 5;
    }

}
