package A_Intro.B_Variables;

public class D_PrimitivesCharacters {
    public static void main(String[] args) {
/*
        - The literal of var data char is only used with '', not ""(String).
        - Unicode table are differents in all OS.
*/

        char character = '\u0040'; // @ in Unicode
        char decimal = 64; // @ in decimal of unicode
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("character = decimal: " + (character == decimal));

        var character2 = '\u0040'; // take it like char
        var decimal2 = 64; // take it like int

        char symbol = '@'; // symbol @ in Unicode
        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character " + (symbol == character) + "\n");

        // special characters:

        char space = ' '; // also: '\u0020';
        char backSpace = '\b'; // drop one character to right to left
        System.out.println("im dropping one\b final letter");
        System.out.println("im dropping one final letter" + backSpace);
        System.out.println("im dropping three final letters" + backSpace + backSpace + backSpace);
        char tabulatorTab = '\t';
        System.out.println("im tabulating this:\t 😄");
        System.out.println("im tabulating this:" + tabulatorTab + decimal2);
        char newLine = '\n';
        System.out.println("new line is following:\n");
        char retornoCarro = '\r';
        System.out.println("new line is following Return to start:\r");
        // \n and \r depends on OS which is using(they are similar for use it)
        // System.lineSeparator() // used for according the OS to take decision if is /n or /r

        System.out.println("char of byte corresponds to byte = " + Character.BYTES);
        System.out.println("char of byte corresponds to bites = " + Character.SIZE);
        System.out.println("value maximum of a char: = " + Character.MAX_VALUE); // it depends on OS
        System.out.println("value minimum of a char: = " + Character.MIN_VALUE + "\n"); // it depends on OS

    }
}
