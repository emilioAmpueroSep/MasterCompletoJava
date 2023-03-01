package B_Arrays;

import java.util.Scanner;

public class LL_SearchString {
    public static void main(String[] args) {
        String[] a = new String[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a word: ");
            a[i] = sc.next();
        }

        System.out.println("\nEnter word for searching:");
        String word = sc.next();
        int i = 0;
//        It can be used while or for to that case:
        while (i < a.length && !a[i].equalsIgnoreCase(word)) {
            i++;
        }
//        for (; i < a.length && !a[i].equalsIgnoreCase(word); i++) {
//        }
        if (i == a.length) {
            System.out.println("Number not found");
        } else if (a[i].toLowerCase().compareTo(word.toLowerCase()) == 0) { // 0 represents to true
            System.out.println("Number found in position: " + i);
        }
    }
}
