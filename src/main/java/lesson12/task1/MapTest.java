package lesson12.task1;

import lesson1.task3.Cat;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        System.out.println("Пустая ли коллекция? - " + map.isEmpty());

        map.put("Orange", 200);
        map.put("Banana", 150);
        map.put("Apple", 89);
        map.put("Potato", 76);
        map.put("Carrot", 112);
        map.put("Pineapple", 238);
        map.put("Lemon", 143);
        map.put("Tomato", 128);

        System.out.println("Цена на морковь: " + map.get("Carrot"));
        System.out.println("Цена на лимон: " + map.get("Lemon"));
        System.out.println("Цена на абрикос: " + map.get("Apricot"));

        map.put("Carrot", 122);

        System.out.println("Цена на морковь: " + map.get("Carrot"));

        System.out.println("Есть ли в списке помидор? - " + map.containsKey("Tomato"));
        System.out.println("Есть ли в списке абрикос? - " + map.containsKey("Apricot"));

        System.out.println("Есть ли в списке товар по цене 143? - " + map.containsValue(143));
        System.out.println("Есть ли в списке товар по цене 99? - " + map.containsValue(99));

        System.out.println("Пустая ли коллекция? - " + map.isEmpty());

        map.remove("Pineapple");

        System.out.println("Есть ли в списке ананас? - " + map.containsKey("Pineapple"));

        System.out.println("Размер коллекции - " + map.size());

        // Вывод в консоль мап при помощи println
        System.out.println(map);

        List<Cat> cats = new ArrayList<>();

        for (Cat cat : cats) {

        }

        System.out.println("Выводим все ключи в консоль:");
        for (String currentKey : map.keySet()) {
            System.out.println(currentKey);
        }

        System.out.println("Выводим все значения в консоль:");
        for (Integer currentValue : map.values()) {
            System.out.println(currentValue);
        }

        System.out.println("Выводим все пары ключ-значение в консоль:");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            // Продукт - Х, цена - Х.
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d.%n", key, value);
        }

        // Удалить из списка все товары дороже 190 и начинающиеся на букву Т

        // Цикл for не подходит для одновременной итерации и изменения коллекции,
        // для этих целей мы должны использовать итератор
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            String key = pair.getKey();
//            Integer value = pair.getValue();
//
//            if (value > 190 || key.startsWith("T")) {
//                map.remove(key);
//            }
//        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value > 190 || key.startsWith("T")) {
                iterator.remove();
            }
        }

        System.out.println("Выводим все пары ключ-значение в консоль:");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            // Продукт - Х, цена - Х.
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d.%n", key, value);
        }
    }
}
