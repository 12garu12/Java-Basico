package com.company;

public class ColorTriangulo extends Triangulo{

    private String color;

    public ColorTriangulo(String c, String s, double b, double h) {
        super(s, b, h);
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void mostrarColor(){
        System.out.println("El color es: "+ color);
    }
}
