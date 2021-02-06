package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Observe cómo vaTest() puede llamarse con un número variable de argumentos
        VarArgs.vaTest(10);
        VarArgs.vaTest(1, 2, 3);
        VarArgs.vaTest();
        VarArgs.vaTest(3, 4, 0, 2, 4, 6);

        VarArgs.vaTest2("Un Parámetro: ", 10); // 1 argumento
        VarArgs.vaTest2("Tres Parámetros: ", 1, 10, 100); // 3 argumentos
        VarArgs.vaTest2("Sin Parametros: "); // Sin argumentos

        VarArgs2.vaTest(1, 3, 5);
        VarArgs2.vaTest("Prueba: ", 10, 20);
        VarArgs2.vaTest(true, false, true);


    }
}
