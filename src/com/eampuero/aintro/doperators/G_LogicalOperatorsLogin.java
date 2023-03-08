package com.eampuero.aintro.doperators;

import java.util.Scanner;

public class G_LogicalOperatorsLogin {
    public static void main(String[] args) {
        /*

        // Static array, it cant change capacity of literal you can add, three max in this case.
        String[] usernames = new String[3]; // start 0 till 2
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";

        */
        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry a username");
        String u = scanner.next();

        System.out.println("Entry the password");
        String p = scanner.next();

        boolean isAuthenticated = false;

        for(int i = 0; i < usernames.length; i++){
            isAuthenticated = (usernames[i].equals(u) && passwords[i].equals(p))? true: isAuthenticated;

            /*
            if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                isAuthenticated = true;
                break; // finish then it finds the result, it cant implement in ternary operator.
            }
            */
        }

        String message = isAuthenticated ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username or password incorrect!\nSorry, requires authentication";
        System.out.println("message = " + message);

        /*if(isAuthenticated){
            System.out.println("Welcome user ".concat(u).concat("!"));
        } else {
            System.out.println("Username or password incorrect!");
            System.out.println("Sorry, requires authentication");
        }*/
    }
}
