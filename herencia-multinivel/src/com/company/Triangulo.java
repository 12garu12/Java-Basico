package com.company;

public class Triangulo extends DosDimensiones{

    private String estilo;

    // Constructor por defecto
    public  Triangulo(){
        super();
        estilo = "ninguno";
    }

    // Constructor parametrizado
    public Triangulo(String s, double b, double h){
        super(b, h);
        estilo = s;
    }

    //Constructor con un argumento
    public Triangulo(double x){
        super(x);
        estilo = "Estilo 1";
    }

    public double area(){
        return getBase() * getAltura() / 2;
    }

    public void mostrarEstilo(){
        System.out.println("El triángulo tiene: " + estilo);
    }

}
