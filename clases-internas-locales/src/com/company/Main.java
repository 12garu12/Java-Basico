package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ClaseExterna externa = new ClaseExterna();

        externa.getValor();

        ExternClass objExtern = new ExternClass();

        if (objExtern.getDato() < 20){

            //Clase interna local dentro de la cláusula if
            class Interna{

                public int getValor(){
                    System.out.println("Dentro de la clase interna.");
                    return objExtern.dato;
                }
            }

            Interna interna = new Interna();
            System.out.println();
            System.out.println(interna.getValor());

        }else {
            System.out.println("Dentro de la clse externa.");
        }

    }
}
