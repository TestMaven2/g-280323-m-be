package lesson22.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        // Проверить, содержит ли строка последовательность символов www
        System.out.println(checkString("http://www.example.com"));
        System.out.println(checkString("www.example.com"));
        System.out.println(checkString("http://www"));
        System.out.println(checkString("www"));
        System.out.println(checkString("http://ww.example.com"));
        System.out.println(checkString("http://wwww.example.com"));
    }

    public static boolean checkString(String source) {

        System.out.println("Проверяемая строка - " + source);

        // Пишем регулярное выражение
        String regex = "[^w]*w{3}[.].*";

        // Компилируем регулярное выражение в объект шаблона
        Pattern pattern = Pattern.compile(regex);

        // Проверяем, соответствует ли переданная в метод строка нашему шаблону
        boolean result = pattern.matcher(source).matches();

        // Возвращаем результат
        return result;
    }
}
