package lesson18.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapTest {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");
        List<String> list3 = Arrays.asList("G", "H", "I");

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(listOfLists);

        // Преобразовать лист листов в обычный лист, содержащий все элементы
        List<String> result = listOfLists.stream().flatMap(x -> x.stream()).toList();
        System.out.println("Результирующий лист - " + result);
    }
}
