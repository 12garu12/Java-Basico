package Proyecto;

import java.io.FileReader;
import java.io.IOException;

public class LeyendoArchivo3 {

    public void archivo3() {

        try {
            FileReader archivo3 = new FileReader("C:\\Users\\ACER\\Desktop\\Prueba.txt");
            int codigo = archivo3.read();

            while (codigo != -1) {
                codigo = archivo3.read();

                char palabra = (char) codigo;
                System.out.print(palabra);
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }

    }
}
