package lesson6.task3;

import java.util.ArrayList;
import java.util.List;

public class Task {

    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        first.add("A");
        first.add("B");
        first.add("C");
        first.add("D");
        first.add("E");

        second.add("D");
        second.add("E");
        second.add("F");
        second.add("G");

        System.out.println(first);
        System.out.println(second);

        // 1. Объединение - A B C D E D E F G
        // 2. Объединение без дубликатов - A B C D E F G
        // 3. Пересечение - D E D E
        // 4. Пересечение без дубликатов - D E
        // 5. Разность - A B C F G
    }
}
