package lesson11.task2;

public class MethodsCallTest {

    public static void main(String[] args) {
        System.out.println("Метод main");
        first();
        System.out.println("Метод main закончил работу");
    }

    public static void first() {
        System.out.println("Первый метод");
        second();
        System.out.println("Первый метод закончил работу");
    }

    public static void second() {
        System.out.println("Второй метод");
        third();
        System.out.println("Второй метод закончил работу");
    }

    public static void third() {
        System.out.println("Третий метод");
        fourth();
        System.out.println(10 / 0);
        System.out.println("Третий метод закончил работу");
    }

    public static void fourth() {
        System.out.println("Четвёртый метод");
        System.out.println("Четвёртый метод закончил работу");
    }
}
