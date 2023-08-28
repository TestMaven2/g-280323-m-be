package lesson17.task1;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        MyFunction function = new MyFunction();
        long result = function.apply(3.54);

        System.out.println("Результат округления - " + result);

        System.out.println(function.apply(5.12));

        Function<Double, Long> function1 = x -> {
            System.out.println("Переданное значение - " + x);
            return Math.round(x);
        };

        System.out.println(function1.apply(8.82));

        Function<Double, Long> function2 = Math::round;

        System.out.println(function2.apply(12.63));
    }
}
