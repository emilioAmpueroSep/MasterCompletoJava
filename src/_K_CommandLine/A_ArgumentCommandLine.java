package _K_CommandLine;

// args: array called type String called args
public class A_ArgumentCommandLine {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("You must enter arguments (parámetros)");
            System.exit(-1);// -1 = error ; 1 = exception ; 0 = OK
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arguments n.º " + i + ": " + args[i]);
        }

    }
}

/*

FORM TO COMPILE MANUALLY, NOT AUTOMATIZED:

- In CMD, possess me in src or src/nameFolderPackage if I have the file inside a package.
- coding: javac A_ArgumentCommandLine.java to generate the file .class
- to compile with arguments must be: java _K_CommandLine.ArgumentCommandLine Emilio Antonio "Pedro Raul" if it's a compound word.(if it's not using package:  java ArgumentCommandLine...)
- If I want to code special characters, I have to use: java _K_CommandLine.ArgumentCommandLine lalo pepe -encoding tf8 or java -encoding tf8 _K_CommandLine.ArgumentCommandLine lalo pepe

- If I want to pass arguments in command line in Intellij Idea, I have to go to up to de text editor, click to edit configurations; select file and write in program arguments the arguments I want it.

 */


// bytecode(.class) is intermediate of code user and binary code

