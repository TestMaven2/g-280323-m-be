package lesson22.task5;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DelimiterTest1 {

    public static void main(String[] args) {

        String text = "Hello5World82I387study79Java";

        String regex = "[1-9]{1,3}";

        Pattern pattern = Pattern.compile(regex);

        String[] words = pattern.split(text);

        String[] words1 = text.split("[1-9]{1,3}");

        Arrays.stream(words).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(words1).forEach(x -> System.out.print(x + " "));
    }
}
