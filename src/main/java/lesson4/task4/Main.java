package lesson4.task4;

public class Main {

    public static void main(String[] args) {

        // Автоупаковка, каждое число приводится к Integer
        Integer[] numbers = {3, 4, 5, 6, 7};

        // Написать метод, который суммирует все значения
        // массива и возвращает результат

        // Автораспаковка, результат работы метода - Integer, и он приводится к int
        int sum = getSumOfArray(numbers);
        System.out.println("Сумма чисел массива: " + sum);

        test(8);
    }

    public static Integer getSumOfArray(Integer[] array) {
        int sum = 0;
        for (Integer current : array) {
            // Автораспаковка, current -> int
            sum = sum + current;
        }
        // Автоупаковка, sum -> Integer
        return sum;
    }

    public static void test (Integer value) {

    }
}
