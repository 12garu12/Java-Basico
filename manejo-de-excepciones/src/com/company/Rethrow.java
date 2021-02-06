package com.company;

public class Rethrow {

    public static void genExcepcion(){

        // Aquí, nums es más largo que denom
        int nums[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < nums.length; i++) {

            try {
                System.out.println(nums[i] + " /" + denom[i] + " es " + nums[i]/denom[i]);
            }catch (ArithmeticException exc){

                // Capturando la excepción.
                System.out.println("No se puede dividir por cero!.");

            }catch (ArrayIndexOutOfBoundsException e){

                // Capturando la excepción.
                System.out.println("No se encontro ningún elemento.");
                throw e; // Relanzando la excepción.
            }
        }

    }



}
