package lesson22.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileFlagTest {

    public static void main(String[] args) {

        String text = "Apple, Banana, Orange";

        String regex = "a";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Индекс вхождения буквы а - " + matcher.start());
        }
    }
}
