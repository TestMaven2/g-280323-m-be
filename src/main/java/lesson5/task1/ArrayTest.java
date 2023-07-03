package lesson5.task1;

import lesson4.task1.Cat;

public class ArrayTest {

    public static void main(String[] args) {

        // Создаём массив типа int длиной 5
        int[] numbers = new int[5];

        // Выводим в консоль длину массива через его свойство
        System.out.println("Длина массива - " + numbers.length);

        // Мы не можем поменять длину массива
//        numbers.length = 7;

        // Присваиваем значение в ячейку массива
        numbers[3] = 15;

        // Считываем значение из ячейки
        System.out.println("Значение ячейки 3 - " + numbers[3]);

        // Считываем значение по умолчанию
        System.out.println("Значение ячейки числового типа по умолчанию - " + numbers[1]);

        boolean[] booleanArr = new boolean[5];
        System.out.println("Значение ячейки логического типа по умолчанию - " + booleanArr[3]);

        Cat[] cats = new Cat[5];
        System.out.println("Значение ячейки ссылочного типа по умолчанию - " + cats[4]);

        // Создаём массив сразу с определёнными значениями
        int[] numbers1 = {5, 8, 2, 9, 1};
        System.out.println(numbers1[1]);

        boolean[] booleans = {false, true, false, false};
        System.out.println(booleans[1]);

        Cat[] cats1 = {new Cat(3, "Black"), new Cat(5, "White"), new Cat(2, "Green")};
        System.out.println(cats1.length);

        System.out.println("Цвет кота в последней ячейке - " + cats1[cats1.length - 1].getColor());
    }
}
