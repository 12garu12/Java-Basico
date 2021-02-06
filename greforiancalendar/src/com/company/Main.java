package com.company;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); // sele pueden dar varios formatos
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println(c1.getTime()); // retorna la fecha exacta actual -> Thu Jan 14 00:13:45 COT 2021
        System.out.println("Fecha formateada: " +sdf.format(c1.getTime()));

        System.out.println("\n fecha establecida:");
        c1.set(2000, Calendar.AUGUST, 31); // para establecer una fecha
        System.out.println("Fecha 31 Agosto 2000: " + c1.getTime()); // Obtine al fecha establecida -> Thu Aug 31 00:13:45 COT 2000
        System.out.println();

        System.out.println("agrega 13 meses mas a la fecha ya establecida");
        c1.set(Calendar.MONTH, 13); // java busca el que se acemeja osea el mes 3 -> March
        System.out.println("Fecha 13 meses mas: " + c1.getTime()); // obtiene la fecha establecida ->Sat Mar 03 00:19:11 COT 2001
        /* como podremos observar no nos imprimirá la fecha deseada, hemos escrito una incoherencia por que no existe mes 13*/
        System.out.println();


        c1.set(2000, Calendar.AUGUST, 31);
        /* volvemos a la fecha anterior usando set y empleamos el método add */

        System.out.println("Ahora sí es correcto");
        c1.add(Calendar.MONTH, 13); /* Añadir 13 meses osea se suman 13 meses a la fecha que ya estaba establecida*/
        System.out.println("Fecha 13 meses mas: " + c1.getTime());

        System.out.println("\n Añade 25 horas");
        c1.roll(Calendar.HOUR, 25);
        System.out.println("25 horas mas:" + c1.getTime());


        System.out.println("Fecha formateada: " + sdf.format(c1.getTime()));

        System.out.println("\n Con la clase LocalDate: ");
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: ".concat(LocalTime.now().toString()));
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
        System.out.println("El instante actual es: " + Instant.now());
        System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now());
        System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23) );

    }
}
