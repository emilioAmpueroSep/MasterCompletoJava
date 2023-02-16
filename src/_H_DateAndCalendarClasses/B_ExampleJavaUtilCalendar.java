package _H_DateAndCalendarClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class B_ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance(); //abstract class, therefore is not use "new" to initialize
//      get a gregorian calendar by default, Japan use a japanese imperial calendar

//      get actual data:
//      Date fechaActual = calendario.getTime();
//      System.out.println("calendario = " + fechaActual);

//      calendario.set(1990, 5, 26, 19, 5, 22); // month start since 0 until 11, not 1...12

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY); // month start since 0 until 11, not 1...12
        calendario.set(Calendar.DAY_OF_MONTH, 25);

//      calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM,Calendar.PM);
        calendario.set(Calendar.MINUTE, 17);
        calendario.set(Calendar.SECOND, 33);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("unformatted date = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("formatted date = " + fechaConFormato);
    }
}
