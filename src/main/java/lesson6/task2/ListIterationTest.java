package lesson6.task2;

import java.util.ArrayList;
import java.util.List;

public class ListIterationTest {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Banana");
        words.add("Orange");
        words.add("Apple");
        words.add("Peach");
        words.add("Ananas");
        words.add("Pear");
        words.add("Watermelon");

        System.out.println(words);

        // Вывести в консоль слово и его длину
        for (String current : words) {
            System.out.println(current + " " + current.length());
        }

        // Вывести в консоль все фрукты, при этом пронумеровать строки
        for (int i = 0; i < words.size(); i++) {
            // words[i] - array; words.get(i) - list
            System.out.println((i + 1) + ". " + words.get(i));
        }

        // Размер листа
        System.out.println("Размер листа - " + words.size());

        String deletedElement = words.remove(3);
        System.out.println("Лист после удаления - " + words);
        System.out.println("Удалённый элемент - " + deletedElement);

        words.add(3, deletedElement);
        System.out.println("Лист - " + words);

        System.out.println("Индекс ананаса - " + words.indexOf("Ananas"));
        System.out.println("Индекс лимона - " + words.indexOf("Lemon"));

        System.out.println("Пустой ли список - " + words.isEmpty());

        System.out.println("Содержит ли список апельсин - " + words.contains("Orange"));
        System.out.println("Содержит ли список вишню - " + words.contains("Cherry"));

        // A B C D E F -> containsAll(C D E) - true
        System.out.println(words.containsAll(List.of("Ananas", "Orange")));
        System.out.println(words.containsAll(List.of("Ananas", "Orange", "Lemon")));

        // Очищаем список
        words.clear();
        System.out.println("Лист - " + words);
        System.out.println("Размер листа - " + words.size());


    }
}
