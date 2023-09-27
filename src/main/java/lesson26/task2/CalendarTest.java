package lesson26.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) {

//        Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        calendar.set(Calendar.MONTH, Calendar.APRIL);
        System.out.println(calendar.get(Calendar.MONTH));

        calendar.add(Calendar.YEAR, 10);
        System.out.println(calendar.get(Calendar.YEAR));

        // 27/09/2023
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(calendar.getTime());
        System.out.println("Отформатированная дата - " + formattedDate);

        // 2023-09-27 10:24

        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(formatter.format(calendar.getTime()));


    }
}
