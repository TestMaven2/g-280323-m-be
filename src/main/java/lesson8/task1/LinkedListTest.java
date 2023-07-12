package lesson8.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        list.remove(0);

        System.out.println(list.get(0));

        // Добавляем элементы в лист
        list.addFirst("Lemon");
        list.addLast("Potato");
        System.out.println(list);

        // Получаем элементы из листа
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        // Заменяем один элемент листа на новый
        list.set(1, "Peach");
        System.out.println(list);

        // Проверяем, существует ли элемент в списке
        System.out.println("Есть ли в списке яблоко - " + list.contains("Apple"));
        System.out.println("Есть ли в списке лимон - " + list.contains("Lemon"));

        // Методы, удаляющие объект из списка
        String deletedElement = list.poll(); // Удаляем первый элемент
        System.out.println("Удалённый элемент - " + deletedElement);
        System.out.println(list);

        String lastElement = list.pollLast();
        System.out.println("Последний элемент - " + lastElement);
        System.out.println(list);

        list.add("Peach");
        list.add("Tomato");
        list.add("Lemon");
        list.add("Peach");
        System.out.println(list);

        list.removeFirstOccurrence("Peach");
        list.removeLastOccurrence("Peach");
        System.out.println(list);
    }
}
