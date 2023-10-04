package lesson24.lesson28.task2;

public class ThreadSleepTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {

        }
        long end = System.currentTimeMillis();
        System.out.println("Затраченное время - " + (end - start));
    }
}