package lesson28.task1;

public class Service {

    public static void test(Runnable r) {
        new Thread(r).start();
    }
}