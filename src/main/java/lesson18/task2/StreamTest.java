package lesson18.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("10", "20", "30", "10", "100", "50");

        // Сложить все элементы листа
        String result = list.stream().reduce((x, y) -> x + y).orElse("");
        System.out.println("Результат сложения элементов - " + result);

        // Сложить все элементы как числа
        result = String.valueOf( // Преобразуем к строке итоговый результат 220   ->   "220"
                list.stream() // "10", "20", "30", "10", "100", "50"
                        .mapToInt(x -> Integer.parseInt(x)) // "10", "20", "30", "10", "100", "50"   ->   10, 20, 30, 10, 100, 50
                        .reduce((x, y) -> x + y) // 10, 20, 30, 10, 100, 50 -> 30, 30, 10, 100, 50 -> 60, 10, 100, 50 -> 70, 100, 50 -> 170, 50 -> 220
                        .orElse(-1)); // Возвращаем результат либо значение по умолчанию
        System.out.println("Результат сложения элементов с преобразованием в числа - " + result);

        String result2 = "" + (list.stream().mapToInt(x -> Integer.parseInt(x)).reduce((x, y) -> x + y).orElse(-1));
        System.out.println(result2);

        // Посчитать количество элементов "10"
        long count = list.stream().filter(x -> x.equals("10")).count();
        System.out.println("Количество элементов 10 - " + count);
        System.out.println("Исходный лист - " + list);

        // Посчитать количество элементов, содержащих подстроку "10"
        count = list.stream().filter(x -> x.contains("10")).count();
        System.out.println("Количество элементов, содержащих подстроку 10 - " + count);

        // Получить лист объектов, отсортированных в естественном порядке
        List<String> sortedList = list.stream().sorted().toList();
        System.out.println("Отсортированный лист - " + sortedList);

        // Получить лист объектов, отсортированных по возрастанию их числового значения
        sortedList = list.stream().sorted((x, y) -> Integer.parseInt(x) - Integer.parseInt(y)).toList();
        System.out.println("Лист, отсортированный как числа - " + sortedList);

        sortedList = list.stream().sorted((x, y) -> x.length() - y.length()).toList();
        System.out.println(sortedList);

        // Отсортировать элементы листа и получить первые три
        List<String> limitedList = list.stream().sorted().limit(3).toList();
        System.out.println("Отсортированный лист с первыми тремя элементами - " + limitedList);

        // Отсортировать лист как числа и пропустить первые два элемента
        List<String> listWithSkipped = list.stream()
                .sorted((x, y) -> Integer.parseInt(x) - Integer.parseInt(y))
                .skip(2).toList();
        System.out.println("Лист с пропущенными элементами - " + listWithSkipped);

        // Получить новый лист, исключив дубликаты
        List<String> listWithoutDuplicates = list.stream().distinct().toList();
        System.out.println("Лист без дубликатов - " + listWithoutDuplicates);

        // Перебрать все элементы листа
        // 1. Вывести в консоль каждый элемент, добавив к нему hello (10   ->   10 hello)
        // 2. Сами элементы потока при этом меняться не должны
        // 3. Отсортировать поток в алфавитном порядке и передать в новый лист
        List<String> newList = list.stream().peek(x -> System.out.println(x + " hello"))
                .sorted().toList();
        System.out.println("Новый лист - " + newList);

        // То же самое задание, но изменения должны отразиться на каждом элементе
        newList = list.stream().map(x -> x + " hello").sorted().toList();
        System.out.println("Новый лист - " + newList);

        // Вывести в консоль каждый элемент дважды через пробел   10   ->   10 10
        list.forEach(x -> System.out.println(x + " " + x));

        List<Integer> numbers = Arrays.asList(8, 2, 9, 4, 3, 1, 5);

        // Найти максимальное число
        int max = numbers.stream().max((x, y) -> x - y).orElse(-1);
        System.out.println("Максимальное число - " + max);

        // Найти минимальное число
        int min = numbers.stream().min((x, y) -> x - y).orElse(-1);
        System.out.println("Минимальное число - " + min);

        max = numbers.stream().min((x, y) -> y - x).orElse(-1);
        System.out.println("Максимальное число - " + max);
    }
}
