package com.company;

public class Triangulo extends DosDimensiones{

    public String estilo;

    public Triangulo(String estilo, double base, double altura){
        super(base, altura);
        this.estilo = estilo;
    }

    public double area(){
        return getBase() * getAltura() / 2;
    }


    public void mostrarEstilo(){
        System.out.println("Triangulo es: " + estilo);
    }

}
