package lesson22.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String text = "Яблоко Груша Привет Ананас Яблоко Привет Вишня Приветствие Привет Яблоко";

        String regex = "Привет ";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.printf("Начало - %d, конец - %d.%n", matcher.start(), matcher.end());
        }
    }
}
