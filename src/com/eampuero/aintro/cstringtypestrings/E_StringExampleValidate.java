package com.eampuero.aintro.cstringtypestrings;

public class E_StringExampleValidate {
    public static void main(String[] args) {
        
        String course = null;
        
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

//        System.out.println(course.toUpperCase()); // NullPointerException, because is a variable with literal null

        if (isNull == false) { // to avoid NullPointerException
            System.out.println(course.toUpperCase());
        }

//        NullPointerException:
//        System.out.println(course.concat(" desde cero!"));
//        System.out.println("Java ".concat(course));
        System.out.println("Java "+ course); // "+" allows to execute variable with null

        System.out.println("==================================================\n");

            if (isNull){
//              course = "Java programming";
//              course = "  ";
              course = "";
            }

            // length() use:
            boolean isVacia = course.length() == 0; // it is empty... isVacia is used for not have problems with isEmpty()
            System.out.println("isVacia = " + isVacia);

            if(isVacia) {
                System.out.println(course.toUpperCase());
                System.out.println("Welcome to the course ".concat(course));
            }

            // isEmpty() use:
            boolean isEmpty2 = course.isEmpty(); // java version 1.6
            System.out.println("isEmpty2 = " + isEmpty2);


            if(course.isEmpty() == false) { // !course.isEmpty()
                System.out.println(course.toUpperCase());
                System.out.println("Welcome to the course".concat(course));

            // isBlank() use: (more strict because dont allow empty data nor white spaces)
            boolean isBlank = course.isBlank(); // java version 11...
            System.out.println("isBlank = " + isBlank);

            if(!course.isBlank()) {
                System.out.println(course.toUpperCase());
                System.out.println("Welcome to the course ".concat(course));
            }
        }
    }
}
