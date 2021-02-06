package com.company;

public class StaticDemo {

    static double raizDe2;
    static double raizDe3;

    static {
        System.out.println("Dentro del bloque estático.");
        raizDe2=Math.sqrt(2.0);
        raizDe3=Math.sqrt(3.0);
    }

    StaticDemo (String msg){
        System.out.println(msg);
    }

}
