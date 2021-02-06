package com.company.herencia;

public class Main {

    public static void main(String[] args) {

        DeDos objetoDeDos = new DeDos();
        DeTres objetoDeTres = new DeTres();

        Series objetoInterface;

        for (int i = objetoDeDos.MIN; i < objetoDeDos.MAX; i++){
                objetoInterface = objetoDeDos;
                System.out.println("Siguiente valor DeDos es: " + objetoInterface.getSiguiente());
                objetoInterface = objetoDeTres;
                System.out.println("Siguiente valor Detres es: " + objetoInterface.getSiguiente());
        }


    }
}
