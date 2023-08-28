package lesson17.task5;

import java.util.function.Function;

public class IdentityTest {

    public static void main(String[] args) {

        Function<String, String> function = x -> x;

        System.out.println(function.apply("Hello"));

        Function<String, String> function1 = Function.identity();

        System.out.println(function1.apply("Hello"));

        System.out.println("Hello");

        String word = "Java";

        String result = function1.apply(word);

        System.out.println(word);
        System.out.println(result);

        System.out.println(word.hashCode());
        System.out.println(result.hashCode());

        System.out.println(word.equals(result));
    }
}
