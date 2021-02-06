package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] nom = {"Mito", "Code", "Jaime", "MitoCode"};
        String[] num = {"2", "4", "6", "8"};
        List<String> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(nom));

        List<String> listnum = new ArrayList<>();
        listnum.addAll(Arrays.asList(num));


        // Filtrar elementos segun lo especificado
        System.out.println("Filtrar elementos");
        lista.stream().filter( x -> x.startsWith("M")).forEach(System.out::println);
        System.out.println();

        // ordenar elementos
        System.out.println("\nOrdenar elementos");
        lista.stream().sorted().forEach(System.out::println);

        // Ordenar elementos de forma acendente
        System.out.println("\nOrdenar elementos de forma acendente");
        lista.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);

        // Tranformar
        System.out.println("\nTransformar");
        lista.stream().map( x -> x.toUpperCase()).forEach(System.out::println);
//        lista.stream().map(String::toUpperCase).forEach(System.out::println);

        // Transformar un String a entero
        System.out.println("\nTransformar de String a enteros");
        listnum.stream().map(Integer::parseInt).forEach(System.out::println);
    //    listnum.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);

        //Limitar
        System.out.println("\nLimitar los elementos que tiene la lista");
        lista.stream().limit(2).forEach(System.out::println);

        //Contar
        System.out.println("\nContar los elementos de una lista");
        Long count = lista.stream().count();
        System.out.println(count);


    }
}
