package lesson19.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Вывести в консоль лист, который
        // содержит все элементы двумерного массива, кроме b

        String[][] symbols = {{"d", "r"},
                              {"p", "c", "b", "s"},
                              {"o", "q", "v"}};

        List<String> result = Arrays.stream(symbols) // String[][] -> stream String[]
                .flatMap(x -> Arrays.stream(x)) // 3 * String[] -> 3 * stream String -> stream String
                .filter(x -> !"b".equals(x)) // фильтруем поток String
                .toList(); // преобразуем поток String к листу

        System.out.println(result);

        // String[][] -> List<Character>

        List<Character> result1 = Arrays.stream(symbols) // String[][] -> stream String[]
                .flatMap(x -> Arrays.stream(x)) // 3 * String[] -> 3 * stream String -> stream String
                .filter(x -> !"b".equals(x)) // фильтруем поток String
                .map(x -> x.charAt(0)) // преобразуем каждую строку к символу
                .toList();

        System.out.println(result1);

        String[][] words = {{"ddd", "rrr"},
                {"ppp", "ccc", "bbb", "sss"},
                {"ooo", "qqq", "vvv"}};

        // d, d, d, r, r, r......

        List<Character> result2 = Arrays.stream(words)
                .flatMap(x -> Arrays.stream(x))
                .map(x -> {
                    Character[] characters = new Character[x.length()];
                    char[] chars = x.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        characters[i] = chars[i];
                    }
                    return characters;
                })
                .flatMap(x -> Arrays.stream(x)) // d, d, d, r, r, r
                .filter(x -> 'b' != x)
                .toList();

        System.out.println(result2);
    }
}
