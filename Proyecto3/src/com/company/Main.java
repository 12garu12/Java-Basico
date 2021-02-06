package com.company;

import java.util.*;

public class Main {

    public void calcular() {

        Operacion operacion = (x, y) -> (x + y) * 2;
        System.out.println(operacion.calcularPromedio(2., 3.));
    }

    public static void main(String[] args) {
        Main coleccion = new Main();
        coleccion.calcular();
    }
}
