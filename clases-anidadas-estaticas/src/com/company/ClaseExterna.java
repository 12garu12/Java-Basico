package com.company;


// Programa Java para demostrar el acceso a una clase anidada estática
// Clase externa
public class ClaseExterna {

    // Miembro estatico
    static int externo_x = 10;

    // Miembro de instancia
    int externo_y = 20;

    // Miembro privado
    private static int externo_rpivado = 30;


    // Clase anidad estática
    static class ClaseAnidadaStatic{

        void mostrar() {
            System.out.println("Clase estatica anidada");

            // Puede acceder al miembro estático de la clase externa
            System.out.println("externo_x: " + externo_x);

            // Puede acceder a mostrar un miembro estático privado de la clase externa
            System.out.println("externo_privado: " + externo_rpivado);

            // Una clase anidada estatica no puede acceder directamente a miembro no estático
            // System.out.println("externo_y = " + externo_y); error

        }

    }

    class ClaseInterna{

        void mostrar(){

            System.out.println("Clase interna.");

            //puede acceder a miembros estaticos de la clase externa
            System.out.println("static int externo_x: " + externo_x);

            //Puede acceder a miembros no estáticos de la clase externa
            System.out.println("int externo_y: " + externo_y);

            //Puede acceder a miembros privados de la clase externa
            System.out.println("externo_privado: " + externo_rpivado);
        }
    }

}
