package lesson3.task4;

import lesson2.task1.Cat;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("До обращения к классу Day");
        Day day = Day.FRIDAY;
        System.out.println("После обращения к классу Day");

        Cat cat = new Cat(3.45);

//        Day day1 = new Day("Понедельник");

        System.out.println("Выводим все возможные названия пятницы:");
        System.out.println(day);
        System.out.println(day.getRussianName());
        System.out.println(day.getShortName());

        System.out.println("Вызываем неабстрактный метод");
        day.printInfo();

        System.out.println("Вызываем абстрактный метод");
        // Это пятый день недели
        day.printOrderOfDay();

        Day day1 = Day.SATURDAY;
        day1.printInfo();

        Day day2 = Day.MONDAY;
        day2.printOrderOfDay();
    }
}
