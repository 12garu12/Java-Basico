package com.company;

public class Main {

    public static void main(String[] args) {

        // Accediendo a la clase anidada estatica
        ClaseExterna.ClaseAnidadaStatic objeto = new ClaseExterna.ClaseAnidadaStatic();

        objeto.mostrar();

        System.out.println();

        ClaseExterna objClassExterna = new ClaseExterna();
        ClaseExterna.ClaseInterna objClassInner = objClassExterna.new ClaseInterna();

        objClassInner.mostrar();

    }
}
