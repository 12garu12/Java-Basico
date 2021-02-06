package com.company.mtodospordefaultdeinterfacejava;



public class Main {


    // Se usara el metodo Default
    public static void main(String[] args) {

        MiInterfaceImplements ob = new MiInterfaceImplements();

        // Puede llamar a getUsuario(), porque está explícitamente implementado por MIIntImp
        System.out.println("Usuario: " + ob.getUsuario());

        // Tambien puede llamar a getAdmin() porque está implementado por defecto
        System.out.println("Admin: " + ob.getAdmin());

        MiInterfaceImplements2 ob2 = new MiInterfaceImplements2();

        System.out.println("Usuario 2: " + ob2.getAdmin());

        // LLamado al metodo estatico de la interfaz
        int univ = MiInterfaz.getUnivesal();
        System.out.println("Metodo estatico de la Infertaz: " + univ);



    }
}
