package com.company;

import java.util.Date;

public class FechaYHora {
    /*
    3.3. Observación de fecha y hora
    Hay dos métodos relacionados con el tiempo en System . Uno es currentTimeMillis y el otro es nanoTime .
    
    currentTimeMillis devuelve el número de milisegundos transcurridos desde la época de Unix, que es el 1 de enero de
    1970 a las 12:00 a.m. UTC:
    */
    public long nowPlusOneHour() {
        return System.currentTimeMillis() + 3600 * 1000L;
    }

    public String nowPrettyPrinted() {
        return new Date(System.currentTimeMillis()).toString();
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
//        for (int i = 0; i < 10000; i++){ // El codigo que se esta midiendo
//            System.out.println(i);
//        }
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime < 10000);
/*
Tenga en cuenta que dado que nanoTime es tan detallado, es más seguro hacer endTime - startTime <10000 que endTime
<startTime debido a la posibilidad de desbordamiento numérico .
Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
Devuelve el valor actual de la fuente de tiempo de alta resolución de la máquina virtual Java en ejecución, en nanosegundos.
*/

    }


}
