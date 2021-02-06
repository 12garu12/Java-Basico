package com.company.otraimplementacionherencia;

public class HerenciaDeInterface {

    public static void main(String[] args) {

        ClaseAImpl obj = new ClaseAImpl("Juan", "Soto", 36);

        obj.printMensaje("Esteban");
        obj.printMensaje2("Gallego");
        obj.printAge(36);
        System.out.println(obj.fullMessage());


    }

}
