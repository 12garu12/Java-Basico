package com.company.herencia;

import com.company.herencia.Constante;

public class ConstanteD implements Constante {

    public static void main(String[] args) {
        int numeros =0;

        for (int i=MIN; i<11; i++){
            if (i>=MAX) System.out.println(MSJERROR);
            else {
                numeros = i;
                System.out.println(numeros+ " ");
            }
        }
    }

}
