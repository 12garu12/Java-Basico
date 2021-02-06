package com.company;


import java.util.Objects;

//Programa Java para demostrar el funcionamiento de
// hashCode() y toString()
public class JDC {

    static int a = 100;
    int b;

    public JDC(){
        b = a;
        a++;
    }

    // Anulando el metodo hashCode()
    @Override
    public int hashCode() {
        return b;
    }
}
