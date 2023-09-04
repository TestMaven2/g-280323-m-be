package lesson19.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Преобразовать двумерный массив в одномерный

        int[][] source = {{9, 2, 7},
                          {6, 1, 8, 3},
                          {5, 4}};

        int[] result = Arrays.stream(source) // Поток одномерных массивов (int[][] -> stream int[])
                .flatMapToInt(x -> Arrays.stream(x))
                // Из каждого элемента потока получаем поток интов (3 элемента int[] -> 3 потока int)
                // метод flatMap объединяет 3 потока int в один поток int
                .toArray(); // поток int преобразуем в массив int[]

        System.out.println(Arrays.toString(result));
    }
}
