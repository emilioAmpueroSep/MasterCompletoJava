package com.eampuero.aintro.hdateandcalendarclasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class D_CalcularEdadIngresandoFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha
        del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se
        pueden apoyar de google que hay varios ejemplos.
*/
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//        System.out.println("Ingrese su fecha de Nacimiento con 'dd-MM-yyyy'");
//
//        try {
//            Date fecNac = sdf.parse(sc.next());
//            Date fecAct = new Date();
//
//            OffsetDateTime calcFecNac = fecNac.toInstant().atOffset(ZoneOffset.UTC);
//            OffsetDateTime calcFecAct = fecAct.toInstant().atOffset(ZoneOffset.UTC);
//
//            int edad = Period.between(calcFecNac.toLocalDate(), calcFecAct.toLocalDate()).getYears();
//
//            System.out.println("Usted tiene " + edad + " años");
//
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = sc.next();

        try {

            Date actual = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = null;
            fechaNacimiento = df.parse(fechaStr);

//          creamos un patron de fecha numérico con el año mes y día
            df = new SimpleDateFormat("yyyyMMdd");

//          luego convertimos ambas fechas la actual y la fecha de nacimiento en enteros que contiene el año mes y día
            int desde = Integer.parseInt(df.format(fechaNacimiento));
            int hasta = Integer.parseInt(df.format(actual));

//          luego restamos ambas fechas y dividimos en 10000 para quitar decimales y dejar la fecha en decenas o centenas
            int edad = (hasta - desde) / 10000;
            System.out.println("La edad es: " + edad);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
