package com.company;


// Uso de varargs con argumentos estándar
public class VarArgs2 {

    static void vaTest(int ... v){
        System.out.println("vaTest(int ...): " + "Número de args: " + v.length);
        System.out.println("Contiene: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.println("vaTest(boolean ...): " + "Número de args: " + v.length);
        System.out.println("Contiene: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contiene: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }


}
