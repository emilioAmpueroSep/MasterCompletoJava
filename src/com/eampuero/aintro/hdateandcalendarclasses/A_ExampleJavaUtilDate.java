package com.eampuero.aintro.hdateandcalendarclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_ExampleJavaUtilDate {
    public static void main(String[] args) {

//      Date by default:
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

//      Date with formatted I want it:
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime(); // calculate the time of run in milliseconds
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);

/*
        list with all values to format dates:
        https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/text/SimpleDateFormat.html
*/
    }
}
