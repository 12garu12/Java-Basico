package com.company;

public class Rectangulo extends DosDimensiones{

    //Constructor por defecto
    Rectangulo(){
        super();
    }

    // Constructor para rectangulo
    Rectangulo(double b, double h){
        super(b, h, "Rectangulo");
    }

    // Un cuadrado
    Rectangulo(double x){
        super(x, "Rectangulo");
    }

    // Objeto desde un objeto
    Rectangulo(Rectangulo ob){
        super(ob);
    }

    boolean escuadrado(){
        if ((getAltura() == getBase())) return true;
        return false;
    }

    @Override
    double area() {
        return getAltura() * getBase();
    }
}
