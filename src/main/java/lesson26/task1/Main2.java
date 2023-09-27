package lesson26.task1;

import java.util.Date;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        Thread.sleep(3000);
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 1);

        System.out.println(date);
        System.out.println(date1);

        System.out.println("Вторая дата позже первой даты? - " + date1.after(date));
        System.out.println("Вторая дата раньше первой даты? - " + date1.before(date));

        System.out.println("Сравнение двух дат - " + date.compareTo(date1));
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        System.out.println("Эквивалентны ли две даты? - " + date2.equals(date1));
    }
}
