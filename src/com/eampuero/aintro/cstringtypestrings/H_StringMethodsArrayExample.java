package com.eampuero.aintro.cstringtypestrings;

public class H_StringMethodsArrayExample {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // show the space in memory used

        char[] arr = trabalenguas.toCharArray();
        int large = arr.length;
        System.out.println("large = " + large);

        for (int i = 0; i < large; i++) {
//            System.out.println(arr[i]);
            System.out.print(arr[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a")); // show the space in memory used

        String[] arr2 = trabalenguas.split("a"); // cut since character "a" in this case
        int l = arr2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arr2[j]);
        }

        String file = "some.image.jpeg";
        String[] filearr = file.split("\\."); // [.]  // irregular expressions
        l = filearr.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l; j++) {
            System.out.println(filearr[j]);
        }
        System.out.println("extension = " + filearr[l-1]);

    }
}
