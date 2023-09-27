package lesson26.task5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

    public static void main(String[] args) {

        ZonedDateTime date = ZonedDateTime.now();

        System.out.println(date);

        LocalDate date1 = LocalDate.now();

        LocalTime time = LocalTime.of(11, 0, 0);

        ZoneId zoneId = ZoneId.systemDefault();

        ZonedDateTime dateTime = ZonedDateTime.of(date1, time, zoneId);

        System.out.println(dateTime);
    }
}
