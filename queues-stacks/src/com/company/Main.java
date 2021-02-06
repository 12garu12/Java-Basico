package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack();

        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);
        numbers.add(5);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(numbers.getClass().getSimpleName()); // Se utiliza para saber la clase del dato
        int num = numbers.peek(); // Dice el elemento siguiente en la cola
        System.out.println(num);
        System.out.println(numbers.isEmpty()); // Para saber si la pila esta vacia
        System.out.println(numbers.pop()); // Borra el ultimo elemento en la pila
        System.out.println(numbers.search(1)); // este método devuelve la distancia desde la parte superior de la pila de la aparición más cercana a la parte superior de la pila; Se considera que el elemento superior de la pila está a distancia 1.
        System.out.println(numbers);
        System.out.println(numbers.search(2));
        System.out.println(numbers.search(7));
        System.out.println(numbers);
        numbers.push(10); // Agrega el elemento al final de la pila o stack
        System.out.println(numbers);
        numbers.setElementAt(80, 2);
        System.out.println(numbers);

    }
}
