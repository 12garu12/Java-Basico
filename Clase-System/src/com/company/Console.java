package com.company;

/*
3. Métodos de utilidad
El sistema nos proporciona numerosos métodos para ayudarnos con cosas como:

Accediendo a la consola
Copiar matrices
Observando fecha y hora
Salir del JRE
Acceder a las propiedades del tiempo de ejecución
Acceder a variables de entorno y
Administrar la recolección de basura
*/

public class Console {
    /* BAELDUNG
   Java 1.6 introdujo otra forma de interactuar con la consola que simplemente usando System.out e in directamente.
   Podemos acceder a él llamando a System.console :
    */
    public static String readUserName() {
        java.io.Console console = System.console();

        return console == null ? null : console.readLine("%", "Enter your name: ");
    }
/*
Tenga en cuenta que, según el sistema operativo subyacente y cómo lancemos Java para ejecutar el programa actual, la
consola puede devolver un valor nulo, así que asegúrese siempre de verificar antes de usar .

Consulte la documentación de la CONSOLA para conocer más usos.
*/

    public static void main(String[] args) {
        System.out.println(readUserName());

    }

}
