package com.company;

public class Main {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo("Estilo 1", 4.0, 4.0);
        Triangulo t2 = new Triangulo("Estilo 2", 8.0, 12.0);

        t1.setBase(4.0);
        t1.setAltura(4.0);
        t1.estilo = "Estilo 1";

        t2.setAltura(8.0);
        t2.setAltura(12.0);
        t2.estilo = "Estilo 2";

        System.out.println("Informacion para T1 ");
        t1.mostrarEstilo();
        t1.mostrarDimensiones();
        System.out.println("Su área es: " + t1.area());

        System.out.println();

        System.out.println("Informacion para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimensiones();
        System.out.println("Su área es: " + t2.area());
        



    }
}
