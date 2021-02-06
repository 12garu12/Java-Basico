package com.company;


// Herencia multinivel
public class DosDimensiones {

    private double base;
    private double altura;

    // Constructor por defecto
    public DosDimensiones(){
        base = altura = 0.0;
    }

    // Constructor parametrizado
    public DosDimensiones(double b, double h){
        base = b;
        altura = h;
    }

    // Construir objeto con la misma base y altura
    public DosDimensiones(double x){
        base = altura = x;
    }

    // Métodos de acceso para base  y altura
    public double getBase(){
        return base;
    }

    double getAltura(){
        return altura;
    }

    public void setBase(double b){
        base = b;
    }

    public void setAltura(double h){
        altura = h;
    }

    public void mostrarDimensiones(){
        System.out.println("La base y la altura son: " + base + " y " + altura);
    }
}
