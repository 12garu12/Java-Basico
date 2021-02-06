package com.company;

public class DosDimensiones {

    private double base;
    private double altura;

    public DosDimensiones(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDimensiones(){
        System.out.println("La base y altura es: " + base + " y " + altura);
    }

}
