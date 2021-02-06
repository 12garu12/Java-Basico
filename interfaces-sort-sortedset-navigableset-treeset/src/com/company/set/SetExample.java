package com.company.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Set demostracion utilizando HashSet -> No admite valores repetidos

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Example");
        hashSet.add("Set");
        hashSet.add("Example");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("For"));

        /*  Operaciones en la interfaz de conjunto */

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        System.out.println(set1);
        System.out.println(set2);

        // Union de dos Set
        Set<Integer> union = new HashSet<>(set1);
        System.out.println("\nUnion entre dos sets");
        union.addAll(set2);
        System.out.println(union);

        // Intercepcion entre Set
        Set<Integer> intersection = new HashSet<>(set1);
        System.out.println("\ninterseccion entre dos sets");
        intersection.retainAll(set2);
        System.out.println(intersection);

        // Para encontrar la diferencia simétrica
        Set<Integer> difference = new HashSet<>(set1);
        System.out.println("\n Diferencia entre los dos sets");
        difference.removeAll(set2);
        System.out.println(difference);

        //  los valores se comparan y clasifican en orden ascendente.
        Set<String> hs = new HashSet<>();
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println("\n los valores se comparan y clasifican en orden ascendente.");
        System.out.println(hs);

        //  Accediendo a los Elementos:
        System.out.print("\nAccediendo al valor de 'A' Contine A: ");
        System.out.println(hs.contains("A"));

        // Eliminar valores
        System.out.print("\nEliminar 'C' del conjunto: ");
        System.out.print(hs.remove("C"));
        System.out.println(" -> Set hs: " + hs);


        // Iterar a través del conjunto
        System.out.println("\nIterar a través del conjunto");
        for (String valor: hs){
            System.out.print(valor + " ");
        }
        System.out.println("\n");

        // Esta clase también permite la inserción de elementos NULL. Veamos cómo crear un objeto de conjunto usando esta clase.
        Set<String> h = new HashSet<>();

        // Adding elements into the HashSet
        // using add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding the duplicate
        // element
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);

        // Removing items from HashSet
        // using remove()
        h.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over set:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());



    }
}
