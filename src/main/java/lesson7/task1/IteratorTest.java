package lesson7.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Apricot");

        // Получаем объект итератора для нашей коллекции
        Iterator<String> iterator = fruits.iterator();

        // Спрашиваем, а есть ли ещё объекты в нашей коллекции
        System.out.println("Есть ли объекты в коллекции? - " + iterator.hasNext());

        // Получаем следующий элемент из коллекции
        System.out.println("Следующий элемент - " + iterator.next());

        // Получаем оставшиеся элементы коллекции при помощи цикла
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        for (int i = 0; i < fruits.size(); i++) {
            String currentElement = fruits.get(i);
            System.out.println(currentElement);
        }

        System.out.println("Запускаем цикл ещё раз:");
//        iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
