package com.company;

public class Triangulo extends DosDimensiones{

    private String estilo;

    //Constructor por defecto
    Triangulo() {
        super();
        this.estilo = "ninguno";
    }

    Triangulo(String s, double b, double h){
        super(b, h, "Triangulo"); // Llama al constructor de la superclase
        this.estilo = s;
    }

    // Constructor con un solo argumento
    Triangulo(double x){
        super(x, "Triangulo");
        this.estilo = "Estilo 1";
    }

    // Construir un objeto desde un objeto
    Triangulo(Triangulo t){
        super(t); //Pasa el objeto al constructor de DosDimensiones
        this.estilo = t.estilo;
    }

    @Override
    double area() {
        return getAltura() * getBase() / 2;
    }
    void mostrarEstilo(){
        System.out.println("El triángulo tiene: " + estilo);
    }
}
