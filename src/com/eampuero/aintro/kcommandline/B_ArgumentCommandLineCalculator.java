package com.eampuero.aintro.kcommandline;

public class B_ArgumentCommandLineCalculator {
    public static void main(String[] args) {
        if(args.length != 3){
            System.err.println("Enter an operation please! " +
                    "(sum, rest, div o multi) and 2 integers");
            System.exit(-1);
        }

        String operation = args[0];
        int a = 0;
        int b = 0;
        double result = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Be carteful a and b must be integers, come back to try!");
            System.exit(-1);
        }
        switch(operation){
            case "sum":
                result = a+b;
                break;
            case "rest":
                result = a-b;
                break;
            case "multi":
                result = a*b;
                break;
            case "div":
                if(b == 0){
                    System.err.println("It cannot possible to divide by o!"); // iompossible to divide by 0
                    System.exit(-1);
                }
                result = (double)a/b;
                break;
            default:
                System.out.println("Operation does not exist!");
        }

        System.out.println("Result of the operation '" + operation + "' is: " +result);
    }
}
