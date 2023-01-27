package _BVariables;

public class A_Variables_Example {
    public static void main(String[] args) {
        String greeting = "Hello world, How it's going?";
        System.out.println(greeting);
        System.out.println("greeting.toUpperCase() = " + greeting.toUpperCase());

/*
Integer and String are classes, thats have methods which can be used on it; the primitives
as float, int, char... etc doesnt have metohds.
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
        // - Nunca usar palabras reservadas como : if, class, null. for , etc.


    } // end main
}


