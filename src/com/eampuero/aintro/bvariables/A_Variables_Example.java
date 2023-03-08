package com.eampuero.aintro.bvariables;

public class A_Variables_Example {
    public static void main(String[] args) {
        String greeting = "Hello world, How it's going?";
        System.out.println(greeting);
        System.out.println("greeting.toUpperCase() = " + greeting.toUpperCase());

/*
Integer and String are classes, they have methods which can be used on it; the primitives
as float, int, char... etc doesnt have methods.
*/

        int number = 10;
    //  Integer number = 10;
        System.out.println("number = " + number);

        boolean valor = true;
        int number2 = 5;
        if (valor){
            System.out.println("number = " + number);
    //      int number5  = 3;  // var local; it will not be seen outside this block
            number2 = 10;
        }
        System.out.println("number2 = " + number2);

        // since java 10 up to now:
        var number3 = 15;
        var number4 = "15";

        // - For convention (good practices), its used camelCase for namimg to variables, although: "$, _ ,name_var" can be used to it.
        // - To avoid to use ñ y accents.
        // - Never to use reserved words like : if, class, null. for , etc.

        /*

        Rules to define names of variables:

        - For convention, Variable names begin with a lowercase letter.
        - It must be a character set included in the Unicode unification.
        - It cannot be the same as a word (reserved from the language), or the name of a boolean value (true or false).
        - They must not have the same name as other variables whose declarations appear in the same scope.
        - If a variable is composed of more than one word, such as 'dataName' the words are put together and each word after the
        The first one,it starts with a Capital letter (camelCase).
         - They can start with a letter, an underscore "_" or a dollar sign "$", with the following characters being letters or digits.

         */


    } // end main
}


