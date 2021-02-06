package com.company;

/**************************************************************************************************************
 Clase interna privada
 A diferencia de una clase "regular", una clase interna puede ser privateo protected. Si no desea que los objetos
 externos accedan a la clase interna, declare la clase como private:
 */

public class OuterClass2 {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }
}
