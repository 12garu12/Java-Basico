package com.company;

public class Main {


    // El comportamiento predeterminado de toString () es
    // imprimir el nombre de la clase, luego @, luego la representación hexadecimal
    // sin firmar del código hash del objeto
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toString(hashCode());
    }

    public static void main(String[] args) {

        JDC s = new JDC();

        // Las dos declaraciones son equivalentes
        System.out.println(s);
        System.out.println(s.toString());

        Object obj = new String("JavaDesdeCero");
        Class c = obj.getClass();
        System.out.println("Clase del objeto obj es: " + c.getName());
        System.out.println("Clase del objeto directa: " + obj.getClass().getName());

    }
}
