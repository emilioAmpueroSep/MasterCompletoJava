package B_Arrays;

import java.util.Scanner;

public class K_ExampleArraysStudentsNotes {
    public static void main(String[] args) {
        double[] mathsClass = new double[7];
        double[] historyClass = new double[7];
        double[] spanishClass = new double[7];
        double sunNotesMaths = 0, sunNotesHistory = 0, sunNotesSpanish = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 7 notes of students of Maths");
        for (int i = 0; i < mathsClass.length; i++) {
            mathsClass[i] = sc.nextDouble();
        }

        System.out.println("Enter 7 notes of students of History");
        for (int i = 0; i < historyClass.length; i++) {
            historyClass[i] = sc.nextDouble();
        }

        System.out.println("Enter 7 notes of students of Spanish");
        for (int i = 0; i < spanishClass.length; i++) {
            spanishClass[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sunNotesMaths += mathsClass[i];
            sunNotesHistory += historyClass[i];
            sunNotesSpanish += spanishClass[i];
        }

        double mathsAverage = (sunNotesMaths / mathsClass.length);
        double historyAverage = (sunNotesHistory / historyClass.length);
        double spanishAverage = (sunNotesSpanish / spanishClass.length);
        System.out.println("Average Maths class: " + mathsAverage);
        System.out.println("Average Maths class: " + historyAverage);
        System.out.println("Average Maths class: " + spanishAverage);
        System.out.println("Total average of course: "
                + (mathsAverage / historyAverage / spanishAverage) / 3);

        System.out.println("Enter the id os some student (range of 0 -6):");
        int id = sc.nextInt();
        double averageStudent = (mathsClass[id] + historyClass[id] + spanishClass[id]) / 3;
        System.out.println("Average of student Number " + id + " : " + averageStudent);


    }
}
