package lesson7.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pineapple");
        fruits.add("Pear");
        fruits.add("Apricot");

        // Пройти по списку фруктов, и если встречается фрукт на букву P,
        // то удалить фрукты перед ним на букву А

        System.out.println("До удаления:");
        System.out.println(fruits);

        ListIterator<String> iter = fruits.listIterator();

        while (iter.hasNext()) {
            String tmp = iter.next();
            if (tmp.startsWith("P")) {
                break;
            }
        }
        while (iter.hasPrevious()) {
            String tmp = iter.previous();
            if (tmp.startsWith("A")) {
                iter.remove();
            }
        }

        System.out.println("Снова проходим по списку:");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("После удаления:");
        System.out.println(fruits);
    }
}
