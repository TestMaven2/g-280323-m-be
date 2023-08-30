package lesson18.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(6, 3, 8, 9, 0, 5, 2, 4);

        // Найти сумму нечётных чисел листа

        // Способ 1 - при помощи цикла
        int sum = 0;

        for (Integer currentNumber : numbers) {
            if (currentNumber % 2 != 0) {
                sum += currentNumber;
            }
        }

        System.out.println("Результат при помощи цикла - " + sum);

        // Способ 2 - при помощи стримов и лямбда-выражений

        int sum2 = numbers.stream() // Поток чисел - 6, 3, 8, 9, 0, 5, 2, 4
                .filter(x -> x % 2 != 0) // 6, 3, 8, 9, 0, 5, 2, 4   ->   3, 9, 5
                .reduce((x, y) -> x + y) // 3, 9, 5   ->   12, 5   ->   17
                .orElse(-1); // Если результат есть, то возвращаем 17
                                  // Если результат не может быть вычислен, возвращаем -1

        System.out.println("Результат при помощи стрима и лямбды - " + sum2);

        List<Integer> numbers1 = Arrays.asList(6, 4, 8, 8, 0, 6, 2, 4);

        Optional<Integer> result = numbers1.stream().filter(x -> x % 2 != 0).reduce((x, y) -> x + y);
        int sum3 = result.orElse(-1);

        System.out.println("Если результат не может быть вычислен, получаем значение по умолчанию - " + sum3);

        // Способ 3 - при помощи стрима и метод-референс

        int sum4 = numbers.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).get();
        System.out.println("Результат при помощи стрима и метод-референс - " + sum4);
    }
}
