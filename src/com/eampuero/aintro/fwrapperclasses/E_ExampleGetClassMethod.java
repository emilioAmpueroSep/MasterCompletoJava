package com.eampuero.aintro.fwrapperclasses;

import java.lang.reflect.Method;

public class E_ExampleGetClassMethod {

    // getClass : Its used for showing details of classes (like a mirror)
    public static void main(String[] args) {
        String texto = "Hello, How are you?";

        Class strClass = texto.getClass();
        // Get details of String class such as name, completen name, package where's located the class.
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        // Get all types of methods exist en String Class in that case:
        for (Method metodo : strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass(); // Get father class of Integer in this case
        Class objClass = intClass.getSuperclass().getSuperclass(); // Get father class of Number in this case
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        // Get all types og methods exist en Object Class in that case:
        for (Method metodo : objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
