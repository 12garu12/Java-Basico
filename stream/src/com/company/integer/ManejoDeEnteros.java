package com.company.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ManejoDeEnteros {

    int[] numeros;

    public ManejoDeEnteros(){
        numeros = new int[]{3, 5, 7, 2, 6, 1};
    }

    public void ordenar(){
        Arrays.stream(numeros).sorted().forEach(System.out::println);
    }

    public void limit(){
        Arrays.stream(numeros).limit(3).forEach(System.out::println);
    }

    public int suma(){
        return Arrays.stream(numeros).sum();
    }




    public static void main(String[] args) {

        ManejoDeEnteros obj = new ManejoDeEnteros();

        obj.ordenar();
        System.out.println("\n");
        obj.limit();
        System.out.println(obj.suma());



    }


}
