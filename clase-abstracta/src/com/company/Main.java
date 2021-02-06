package com.company;

public class Main {

    public static void main(String[] args) {

        DosDimensiones tri = new Triangulo("Estilo 1", 8.0, 12.0);
        System.out.println("El objeto es: " + tri.getNombre());
        System.out.println("El area es: " + tri.area());

        DosDimensiones tri2 = new Triangulo(7.0);
        System.out.println("El objeto es: " + tri2.getNombre());
        System.out.println("El area es: " + tri2.area());
    }
}
