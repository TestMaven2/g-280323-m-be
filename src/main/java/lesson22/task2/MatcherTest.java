package lesson22.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String text = "Яблоко Ананас Привет Груша";
        String regex = "Привет";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Соответствует ли переданная строка шаблону? - " + matcher.matches());

        System.out.println("Есть ли в тексте подстрока, соответствующая шаблону? - " +
                matcher.find());

        System.out.println("Начало найденной подстроки - " + matcher.start());
        System.out.println("Конец найденной подстроки - " + matcher.end());
    }
}
