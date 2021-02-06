package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInOutErr {

// System.in apunta al estándar in, exponiéndolo como un InputStream, y podemos usarlo para leer la entrada desde la consola.
// Y aunque estamos un poco más involucrados, aún podemos gestionar:

    public String readUser(int length) throws IOException {
        byte[] name = new byte[length];
        System.in.read(name, 0, length); // por defecto, desde la consola
        return new String(name);
    }
//    Al llamar a System.in.read , la aplicación se detiene y espera la entrada del estándar in. Cualquiera que sea la
//    siguiente longitud, los bytes se leerán de la secuencia y se almacenarán en la matriz de bytes.

//    Todo lo que escriba el usuario permanece en la secuencia , esperando a que se lea otra llamada .
//
//    Por supuesto, operar en un nivel tan bajo puede ser desafiante y propenso a errores, por lo que podemos limpiarlo un
//    poco con BufferedReader :

    public static String readUserName() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        return reader.readLine();
    }

//      en la funcion main principal
//    public static void main(String[] args) throws IOException {
//    System.out.println(readUserName());
//    }

/*
Con la disposición anterior, readLine leerá de System.in hasta que el usuario presione return, que está un poco más
cerca de lo que podríamos esperar.

Tenga en cuenta que, a propósito, no cerramos la transmisión en este caso. El cierre de la norma en los medios que no
se puede leer de nuevo durante el ciclo de vida del programa!

Y finalmente, un uso avanzado de System.in es llamar a System.setIn para redirigirlo a un InputStream diferente .
*/


    public static void main(String[] args) throws IOException {

        System.out.println(readUserName());
    }
}
