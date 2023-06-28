package lesson4.task2;

import lesson4.task1.Cat;

public class Main {

    public static void main(String[] args) {

        int value = 5;
        Cat cat = new Cat();
        cat.setAge(3);

        System.out.println("Значения до вызова методов:");
        System.out.println("Значение int - " + value);
        System.out.println("Значение возраста кота - " + cat.getAge());

        changeValue(value);
        changeValue(cat);

        System.out.println("Значения после вызова методов:");
        System.out.println("Значение int - " + value);
        System.out.println("Значение возраста кота - " + cat.getAge());
    }

    public static void changeValue(int value) {
        value++;
    }

    public static void changeValue(Cat cat) {
//        cat.setAge(cat.getAge() + 1);

        int currentAge = cat.getAge();
        int newAge = currentAge + 1;
        cat.setAge(newAge);
    }
}
