package com.company.demothrows;

import java.io.IOException;

public class ThrowsDemo {
    public static char prompt(String args) throws IOException{
        System.out.println( args + " :");
        return (char) System.in.read();
    }

    public static void main(String[] args) {

        char ch;

        try {
            // LLamado a promp() podría arrojar una excepción,
            // una llamada debe incluirse dentro de un bloque try
            ch = prompt("Ingresar una letra");
        }catch (IOException e){
            System.out.println("Ocurrio una excepción de E/S");
            ch = 'X';
        }

        System.out.println("Usted presiono: " + ch);

    }

}
