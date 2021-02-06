package com.company.treeset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {

    public static void main(String[] args) {

        /*
          TreeSet: clase TreeSet que se implementa en el marco de las colecciones, una implementación de la interfaz
          SortedSet y SortedSet extiende la interfaz del conjunto. Se comporta como un conjunto simple con la excepción
          de que almacena elementos en formato ordenado. TreeSet utiliza una estructura de datos de árbol para el
          almacenamiento. Los objetos se almacenan en orden ascendente. Pero podemos iterar en orden descendente usando
          el método TreeSet.descendingIterator (). Veamos cómo crear un objeto de conjunto usando esta clase.
        */

        Set<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        ts.add("Colombia");
        ts.add("Argentina");
        ts.add("Perú");

        // Agregando elemento duplicado
        ts.add("India");

        // Mostrar elementos del Set
        System.out.println("Elementos del Set: " + ts);

        // Eliminando un elemento
        System.out.println("Elemento a eliminar 'Australia' Set ts: " + ts. remove("Australia") + ts );

        //Iterando sobre el Set
        System.out.println("Iterando sober el set: ");
        Iterator<String> i = ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // Pasando el set a un Array
        /*ArrayList countries = ts.toArray();
        System.out.println(countries);*/

    }

}
