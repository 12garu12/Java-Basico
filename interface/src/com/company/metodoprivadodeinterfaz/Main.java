package com.company.metodoprivadodeinterfaz;

public class Main {

    public static void main(String[] args) {

        SeriesImplement obj = new SeriesImplement();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Ste valor: " + obj.getSiguiente());
        }

        System.out.println(obj.getSiguienteArray(30));


    }

}
