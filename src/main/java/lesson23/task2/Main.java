package lesson23.task2;

import lesson21.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        List list = new ArrayList();

        list.add(new Cat(4, "Gray", 5.12));
        list.add("Hello");
        list.add(7);

        System.out.println(((Cat) list.get(1)).getColor());
    }
}