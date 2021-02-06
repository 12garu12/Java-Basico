package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            System.out.println("Antes de lanzar una excepción.");
            throw new ArithmeticException(); // Se lanza la excepción

        }catch (ArithmeticException e){
            // Capturando la excepción
            System.out.println("Excepción capturada.");
        }

        System.out.println("Después del bloque try/catch");


    }
}
