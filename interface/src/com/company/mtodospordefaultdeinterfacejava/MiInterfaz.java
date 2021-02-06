package com.company.mtodospordefaultdeinterfacejava;

public interface MiInterfaz {

    // Esto es una declaración normal de un método eso no define la implementación de default
    public int getUsuario();


    //Esto es un Metodo default
    default int getAdmin(){
        return 1;
    }

    //Esto es un método static de interfaz
    static int getUnivesal() {
        return 0;
    }



}
