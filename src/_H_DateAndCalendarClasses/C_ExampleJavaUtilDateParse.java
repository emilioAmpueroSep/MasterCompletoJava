package _H_DateAndCalendarClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C_ExampleJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Enter a date formatted like: 'yyyy-MM-dd': ");
//      When we use parse method, it asks for us adding a try catch:
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

//          COMPARE DATES:
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

//          Form 1:
            if (fecha.after(fecha2)) {
                System.out.println("fecha added is later than fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha is previous than fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha is equal to fecha2");
            }

//          Form 2:
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("fecha added is later than fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha is previous than fecha2");
            } else if (fecha == fecha2) {
                System.out.println("fecha is equal to fecha2");
            }

        } catch (ParseException e) {
//            e.printStackTrace();
            System.err.println("Date has an incorrect format: ");
            System.err.println("The format must be: 'yyyy-MM-dd'");
//          System.exit(1); //to finish to run
            main(args); // return to main methods
        }
    }
}
