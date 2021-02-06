package com.company;

public class Student extends Person{


    public Student(){

        // Invoca al constructor de la clase Padre
        super();

        System.out.println("Constructor de la clase Student");
    }

    public void message(){
        System.out.println("Esta es una clase estudiante");
    }

    public void display(){

        // Tenga en cuaenta que display() solo esta en la clase Student
        message();

        // Invocara al metodo message() de la clase base;
        super.message();

    }


}
