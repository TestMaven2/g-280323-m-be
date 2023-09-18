package lesson23.task5;

import lesson21.task4.Cat;

public class Main {

    public static void main(String[] args) {

        print(5.4);
        print(7);
        print("Hello");
        print(new Cat(3, "White", 5.12));
    }

    // Задача метода - вывести в консоль переданное значение (любого типа)
    public static <T> void print(T item) {
        System.out.println(item);
    }

//    public static void print(Double value) {
//        System.out.println(value);
//    }
//
//    public static void print(Integer value) {
//        System.out.println(value);
//    }
}
