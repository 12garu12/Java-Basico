package com.company;

import java.time.*;
import java.time.temporal.*;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        System.out.println("Paquete Java Time\n");

        System.out.println("Fecha actual: " + LocalDate.now() + "\n");

        System.out.println("Hora actual: " + LocalTime.now());

        System.out.println("\nFecha y Hora actual: " + LocalDateTime.now());

        System.out.println("\nEl instante actual es: " + Instant.now());

        System.out.println("\nLa Fecha y Hora actuales con zona horaria son: " + ZonedDateTime.now());
/*

        Para controlar qué fechas y horas generamos podemos usar el método factoría of() que admite ciertos parámetros
        en función del tipo de dato utilizado. Por ejemplo:
*/
        System.out.println("\nFecha de mi cumpleaños: " + LocalDate.of(1984, 4, 12));

        System.out.println("\nCon la hora exacta: " + LocalDateTime.of(1984, Month.APRIL, 12, 8, 32, 15));

/*       Partes de una fecha o una hora
        Es posible extraer cualquier parte de una fecha o una hora a través de los métodos getXXX() que ofrecen estas
        clases. Por ejemplo, getHour(), getMinute(), getMonth() o getDayOfWeek().      */

        System.out.println("\nObtener las partes de la fecha actual!");
        LocalDate fechaActual = LocalDate.now();

        System.out.println(fechaActual);

        System.out.println("Obtener el año: " + fechaActual.getYear());
        System.out.println("Obtener el mes: " + fechaActual.getMonth());
        System.out.println("Obtener el mes por valor: " + fechaActual.getMonth().getValue());
        System.out.println("Obtener el dia: " + fechaActual.getDayOfMonth());
        System.out.println("Obtener el dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Obtener el dia del mes: " + fechaActual.getDayOfMonth());
        System.out.println("Obtener el dia de la semana: " + fechaActual.getDayOfWeek());
        System.out.println("Obtener Era: " + fechaActual.getEra());
        System.out.println("Cronologia: " + fechaActual.getChronology());

        LocalTime horaActual = LocalTime.now();

        System.out.println("\nObtener las partes de la hora actual!");
        System.out.println(horaActual);
        System.out.println("Obtener hora: " +  horaActual.getHour());
        System.out.println("Obtener minutos: " + horaActual.getMinute());
        System.out.println("obtener segundos: " + horaActual.getSecond());
        System.out.println("obtene nanosegundos: " + horaActual.getNano());

/*
        Transformando fechas y horas
        O lo que es lo mismo: construyendo unas fechas y horas a partir de otras. Según la clase que manejemos tendremos
        una serie de métodos para añadir o quitar intervalos al dato.

        Por ejemplo, la clase LocalDate dispone de los métodos:

                plusDays() / minusDays(): para sumar o restar días a la fecha.
                plusWeeks() / minusWeeks(): ídem con semanas.
                plusMonths() / minusMonths(): para añadir o quitar meses.
                plusYears() / minusYears(): para sumar o restar años.
       Del mismo modo LocalTime ofrece los métodos plusNanos(),
       plusSeconds(), plusMinutes() y plusHours() para sumar nanosegundos, segundos, minutos y horas a la hora
       actual respectivamente. Del mismo modo, tiene los mismos métodos, pero con el prefijo minus, para
       restarlas: minusNanos(), etc. Intuitivo y directo:
*/
        System.out.println("\n calculos con fechas y horas!");
        System.out.println("La fecha dentro de 10 dias: " + LocalDate.now().plusDays(10));
        System.out.println("La fecha y hora de hace 32 horas: " + LocalDateTime.now().minusHours(32));

/*
Aparte de los métodos de suma y resta de fechas que acabamos de ver, existe una clase especializada llamada
TemporalAdjuster que nos permite definir ajustes para las fechas para obtener nuevas fechas a partir de una existente.
Existe una clase factoría llamada TemporalAdjusters (en plural) cuyos métodos permiten obtener ajustes de fecha (de la
clase TemporalAdjuster) de manera sencilla para hacer muchas cosas.
Por ejemplo, si queremos obtener el primer día del mes de una determinada fecha podemos usar el método
TemporalAdjusters.firstDayOfMonth(). Del mismo modo existen "ajustadores" para otras operaciones similares, que puedes
ver en el enlace anterior.

Así, para averiguar la fecha del primer día del mes que viene, podemos escribir:
*/
        LocalDate fecha = LocalDate.now();

        System.out.println();
        System.out.println("El primer día del próximo mes es: " + fecha.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println( "El último día de este mes es: " + fecha.with(TemporalAdjusters.lastDayOfMonth()));

/*
Tiempo transcurrido entre fechas y horas
Otra tarea habitual que necesitaremos hacer es obtener la diferencia entre dos fechas u horas, o sea, el tiempo
transcurrido entre dos instantes de tiempo.

Para ello existe una interfaz java.time.temporal.TemporalUnit, una enumeración ChronoUnit y un clase Period en ese mismo
paquete que se encargan de facilitarnos la vida para esto. Con sus métodos: between() y until() nos proporcionan respectivamente
el tiempo transcurrido entre dos instantes de tiempo y el tiempo que falta para llegar a una fecha u hora
determinadas. Vamos a verlo.

Por ejemplo, imaginemos que queremos saber cuánto tiempo ha transcurrido entre la fecha de tu nacimiento y el día de hoy.
Para averiguarlo sólo hay que hacer algo como esto:
*/
        System.out.println("\nTiempo transcurrido entre fechas y horas!");
        LocalDate fNacimiento = LocalDate.of(1984, Month.APRIL, 12);
        Long tiempo = ChronoUnit.YEARS.between(fNacimiento, LocalDate.now());
        System.out.println("Tu edad es de " + tiempo + " años.");


        System.out.println("Buscando el numero de la semana");
        LocalDate date = LocalDate.now();
        Locale locale = Locale.US;
        Integer weekOfYear = date.get(WeekFields.of(locale).weekOfWeekBasedYear());
        System.out.println("Numero de la semana fecha actual: " + weekOfYear);

        LocalDate localDate = LocalDate.of(2021, 1, 12);
        Integer weekNumber = localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        System.out.println("Numero de la semana: " + weekNumber);

        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 9, 10, 0, 1);
        Integer weekNum = localDateTime.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        System.out.println("Numero de la semana con localDateTime: " + weekNum);

        LocalDateTime date1 = LocalDateTime.of(2021, 1, 3, 10, 35, 0);
        LocalDateTime date2 = LocalDateTime.of(2021, 1, 3,12,0,0);

        Float time = ChronoUnit.SECONDS.between(date1, date2) / 3600f; // para sacar las horas exactas entre fechas

        String day = date1.getDayOfWeek().toString();

        Float min = 35 / 60f;

        System.out.println(min);



    }

}
