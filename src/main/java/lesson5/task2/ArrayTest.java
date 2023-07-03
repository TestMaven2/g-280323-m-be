package lesson5.task2;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        double[] doubles = {2.8, 7.1, 8.12, 0, 4.35};
        // Вывод массива в консоль
        System.out.println(Arrays.toString(doubles));

        // Вывод каждого элемента массива в консоль с новой строки
        for (int index = 0; index < doubles.length; index++) {
            System.out.println(doubles[index]);
        }
        System.out.println();

        // Вывод каждого элемента с прибавлением единицы
        for (double number : doubles) {
            System.out.println(number + 1);
        }

        System.out.println();

        for (int index = 0; index < doubles.length; index++) {
            System.out.println(doubles[index] + 1);
        }

        double[] doubles1 = doubles.clone();

        System.out.println(Arrays.toString(doubles1));
    }
}
