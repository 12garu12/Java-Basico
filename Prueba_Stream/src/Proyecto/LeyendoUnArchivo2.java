package Proyecto;

import java.io.FileReader;
import java.io.IOException;

public class LeyendoUnArchivo2 {

    public void archivo2() {

        try {
            FileReader archivo = new FileReader("C:\\Users\\ACER\\Documents\\Prueba2.txt");
            int codigo = archivo.read();

            while (codigo != -1) {
                codigo = archivo.read();

                char palabra = (char) codigo;

                System.out.print(palabra);
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }

    }
}
