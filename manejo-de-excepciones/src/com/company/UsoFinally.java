package com.company;

public class UsoFinally {

    public static void  genExcepcion(int rec){

        int t;
        int[] nums = new int[4];

        System.out.println("Recibiendo " + rec);

        try {
            switch (rec){
                case 0:
                    t = 10 / rec;
                    break;
                case 1:
                    nums[5] = 4; // Genera un error de indexación
                    break;
                case 2:
                    return; // Retorna desde el blque try
            }

        }catch (ArithmeticException exc){
            // Capturando la excepción
            System.out.println("Elemento no encontrado.");

        }finally {
            // Esto se ejecuta al salir de los bloques try/catch.
            System.out.println("Saliendo de try.");
        }


    }

}
