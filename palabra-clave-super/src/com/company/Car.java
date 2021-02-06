package com.company;

// Subclase o clase deribada
public class Car extends Vehicle{

    public int maxSpeed = 180;

    public void display(){
        // Imprime maxSpeed de la clase base(Vehicle)
        System.out.println("Velocidad maxima: " + super.maxSpeed);
    }

}
