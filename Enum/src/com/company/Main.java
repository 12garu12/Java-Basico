package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Transporte transporte = Transporte.Barco;

        System.out.println("El transporte para mañana es en " + transporte);
        System.out.println(transporte.getClass());

        Transporte[] tiposDeTransporte = Transporte.values();

        for (Transporte trt: tiposDeTransporte){
            System.out.println(trt);
        }

        System.out.println(Transporte.valueOf("Coche") + "--> result");
        System.out.println(transporte.ordinal());


    }
}
