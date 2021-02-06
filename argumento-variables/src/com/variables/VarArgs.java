package com.company;


// Demostracion de argumentos variables en java
public class VarArgs {

    // Este metodo utiliza vararg(argumentos de longitud variable)
    static  void vaTest(int ... v){
        System.out.println("Número de argumentos: " + v.length);
        System.out.println("Contiene: ");
        if (v.length == 0){
            System.out.println("Sin argumentos.\n");
        }else {
            for (int i = 0; i < v.length; i++) {
                System.out.println(" arg " + i + ": " + v[i]);
            }
            System.out.println();
        }
    }

    // Aquí msg es un parámetro normal y 'v' es un parametro vararg
    static void vaTest2(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contiene: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }


}
