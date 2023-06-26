package lesson3.task4;

public class Main {

    public static void main(String[] args) {

        Day day = Day.THURSDAY;

        int order = day.ordinal();
        System.out.println("Order: " + order);

        Day day1 = getDayOfWeek("FrIdAy");

        System.out.println(day1.ordinal());

        Day[] days = Day.values();

        System.out.println("Названия дней недели:");

        for (Day currentDay : days) {
            System.out.println(currentDay);
        }
    }

    public static Day getDayOfWeek(String nameOfDay) {
        Day day = Day.valueOf(nameOfDay.toUpperCase());
        return day;
    }
}
