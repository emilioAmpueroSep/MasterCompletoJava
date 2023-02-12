package _C_StringTypeStrings;

public class F_StringMethodsExample {
    public static void main(String[] args) {
        String name = "Emilio";

        System.out.println("\nlength()=============================");

        // count characters inside of array String object
        System.out.println("name.length() = " + name.length());

        System.out.println("\ntoUpperCase()=============================");

        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        System.out.println("\ntoLowerCase()=============================");

        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        System.out.println("\nequals() && equalsIgnoreCase()=============================");

        System.out.println("name.equals(\"Emilio\") = " + name.equals("Emilio")); // \" to write " inside strings
        System.out.println("name.equals(\"emilio\") = " + name.equals("emilio"));
        System.out.println("name.equalsIgnoreCase(\"emilio\") = " + name.equalsIgnoreCase("emilio"));

        System.out.println("\ncompareTo()=============================");

        // the same of equals, but it returns a int value (0 = true, other numbers lexico graphics)
        System.out.println("name.compareTo(\"Emilio\") = " + name.compareTo("Emilio"));
        System.out.println("name.compareTo(\"Aaron\") = " + name.compareTo("Aaron"));

        System.out.println("\ncharAt()=============================");

        // take a character and to show it, since 0 till last one.
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(0) = " + name.charAt(1));
        // to show always the last character(-1 because it gives error)
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        System.out.println("\nsubstring()=============================");

        //subtract parts of a string
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(1,4) = " + name.substring(name.length()-1));

        String tongueTwister = "tongueTwister";

        System.out.println("\nreplace()=============================");

        System.out.println("tongueTwister = " + tongueTwister.replace("t","🤪"));
        System.out.println("tongueTwister = " + tongueTwister); // its immutable

        System.out.println("\nindexOf()=============================");

        System.out.println("tongueTwister.indexOf('n') = " + tongueTwister.indexOf('n'));
        System.out.println("tongueTwister.indexOf('x') = " + tongueTwister.indexOf('x')); // -1 it means does not exist

        System.out.println("\nlastIndexOf()=============================");

        System.out.println("tongueTwister.lastIndexOf('t') = " + tongueTwister.lastIndexOf('t')); // show where is the last character in the string
        System.out.println("tongueTwister.lastIndexOf('Twister') = " + tongueTwister.lastIndexOf("Twister"));

        System.out.println("\ncontains()=============================");

        // validate if character or string exist in variable(boolean), it only accepts "" not ''
        System.out.println("tongueTwister.contains('t') = " + tongueTwister.contains("t"));

        System.out.println("tongueTwister.contains('t') = " + tongueTwister.startsWith("tong"));
//        System.out.println("tongueTwister.contains('t') = " + tongueTwister.startsWith("t"));
        System.out.println("tongueTwister.contains('t') = " + tongueTwister.endsWith("ter"));
//        System.out.println("tongueTwister.contains('t') = " + tongueTwister.endsWith("r"));

        System.out.println("\ntrim()=============================");

        // eliminate spaces:
        System.out.println("     tongueTwister  ");
        System.out.println("     tongueTwister  ".trim());


    }
}
