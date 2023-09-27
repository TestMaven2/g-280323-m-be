package lesson26.task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();

        Thread.sleep(200);

        Date date1 = new Date();

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.getTime());
        System.out.println(date1.getTime());
    }
}