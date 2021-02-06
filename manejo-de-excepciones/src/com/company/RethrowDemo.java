package com.company;

public class RethrowDemo {

    public static void main(String[] args) {

        try {

            Rethrow.genExcepcion();

        }catch (ArrayIndexOutOfBoundsException exc){

            //Recapturando la excepcion
            System.out.println("Mensaje estandar:");
            System.out.println(exc);

            System.out.println("\nError - Programa terminado.");
            System.out.println("\ngetMessage: " + exc.getMessage());
            System.out.println("\ngetLocalizedMessage:" + exc.getLocalizedMessage());
            System.out.println("\ntoString:" + exc.toString());
            System.out.println("\nfillInStackTrace:" + exc.fillInStackTrace());
            System.out.println("\nprintStackTrace:");
            exc.printStackTrace();

        }finally {
            System.out.println("Despues de ejecutar el bloque try and catch.");
        }


    }
}
