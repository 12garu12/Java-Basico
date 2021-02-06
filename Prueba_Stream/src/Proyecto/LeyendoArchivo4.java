package Proyecto;

import java.io.FileReader;
import java.io.IOException;

public class LeyendoArchivo4 {

    public void Archivo4() {

        try {
            FileReader entrada = new FileReader("C:\\Users\\ACER\\Documents\\movies.csv");
            int codigo = entrada.read();

            while (codigo != -1) {
                codigo = entrada.read();

                char palabra = (char) codigo;
                System.out.print(palabra);
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
