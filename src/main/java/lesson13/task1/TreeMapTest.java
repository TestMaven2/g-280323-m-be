package lesson13.task1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap<String, Integer> items = new TreeMap<>();

        items.put("Orange", 190);
        items.put("Tomato", 150);
        items.put("Apple", 90);
        items.put("Banana", 140);
        items.put("Watermelon", 40);
        items.put("Peach", 170);
        items.put("Lemon", 110);

        for (Map.Entry<String, Integer> item : items.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            System.out.printf("Товар - %s, цена - %d.%n", key, value);
        }

        TreeMap<Cat, Integer> cats = new TreeMap<>();

        cats.put(new Cat(5, "Black", 6.12), 1);
        cats.put(new Cat(9, "White", 5.82), 2);
        cats.put(new Cat(2, "Gray", 4), 3);
        cats.put(new Cat(2, "Red", 5.19), 8);
        cats.put(new Cat(3, "Black", 3.98), 4);
        cats.put(new Cat(7, "Gray", 7.3), 5);
        cats.put(new Cat(8, "Green", 6.3), 6);
        cats.put(new Cat(1, "Blue", 5.55), 7);

        for (Map.Entry<Cat, Integer> pair : cats.entrySet()) {
            Cat cat = pair.getKey();
            Integer id = pair.getValue();
            System.out.println(cat + " " + id);
        }
    }
}
