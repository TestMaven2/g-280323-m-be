package lesson4.task5;

import lesson4.task1.Cat;

public class ComparingTest {

    public static void main(String[] args) {

        // Сравнение примитивных типов
        int x = 7;
        int y = 7;
        boolean compare = x == y;

        System.out.println("Сравнение x и y: " + compare);

        Cat cat1 = new Cat(3, "Black");
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setAge(3);

        compare = cat1 == cat2;

        System.out.println("Сравнение двух котов: " + compare);

        Integer integerX = 7;

        compare = x == integerX;

        System.out.println("Сравнение int и Integer: " + compare);

        Integer integerY = new Integer(7);

        compare = integerX == integerY;

        System.out.println("Сравнение двух Integer: " + compare);

        compare = cat1.equals(cat2);

        System.out.println("Сравнение двух котов: " + compare);

        int a = 50;
        char ch = 'D';

        compare = a == ch;
    }
}