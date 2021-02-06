package com.company.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        /*
         LinkedHashSet: la clase LinkedHashSet que se implementa en el marco de colecciones es una versión ordenada de
         HashSet que mantiene una lista doblemente vinculada en todos los elementos. Cuando se necesita mantener el orden
         de iteración, se utiliza esta clase. Al iterar a través de un HashSet, el orden es impredecible, mientras que
         un LinkedHashSet nos permite iterar a través de los elementos en el orden en que fueron insertados. Veamos cómo
         crear un objeto de conjunto usando esta clase.
        */

        Set<String> lh = new LinkedHashSet<>();
        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");
        lh.add("Colombia");
        lh.add("Argentina");
        lh.add("Perú");

        // Agregando elemento duplicado
        lh.add("India");

        //Visualización del LinkedHashSet
        System.out.println(lh);

        // Eliminar elementos de LinkedHashSet usando remove ()
        lh.remove("Australia");
        System.out.println("\nDespues de eliminar un elemento: " + lh);

        // Iterando sobre elementos de conjuntos hash vinculados
        System.out.println("\nIterando sobre elementos de conjuntos hash vinculados");
        Iterator<String> i = lh.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }


}
