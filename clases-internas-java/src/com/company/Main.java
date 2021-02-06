package com.company;

import com.company.ClaseExterna2;

public class Main {

    public static void main(String[] args) {
        /*primera parte  ********************************************************************************************/
        // write your code here
        // Instancia de un objeto de la clase padre
        //OuterClass outerObj = new OuterClass();

        // Instancia de un objeto de la clase hija
        /*OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(outerObj.x);
        System.out.println(innerObj.y);

        System.out.println(outerObj.x + innerObj.y);*/


        /*Segunda parte   ********************************************************************************************/
        /*ClaseExterna2 externa = new ClaseExterna2();
        if(externa.getDato() < 20){
            // Clase interna local dentro de la cláusula if
            class Interna {
                public int getValor() {
                    System.out.println("Dentro de la clase interna.");
                    return externa.dato;
                }
            }
            Interna interna = new Interna();
            System.out.println(interna.getValor());
        } else{
            System.out.println("Dentro de la clase externa.");
        }
        */
        /*Tercera parte   *******************************************************************************************/

        int x[] = {3, 2, 1, 5, 6, 7, 8, 9};
        ClaseExterna3 extob = new ClaseExterna3(x);
        extob.analizar();


    }

}
