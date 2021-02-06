package com.company.metodoprivadodeinterfaz;

public class SeriesImplement implements Series{

    int iniciar;
    int valor;
    int anterior;

    public SeriesImplement(){
        iniciar = 0;
        valor = 0;
    }

    @Override
    public int getSiguiente() {
        anterior = valor;
        valor += 2;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor = iniciar;
        anterior = valor - 2;
    }

    @Override
    public void setEmpezar(int x) {
        iniciar = x;
        valor = x;
        anterior = x - 2;
    }

    // Anadiendo un método que no está definido en Series
    int getAnteror(){
        return anterior;
    }
}
