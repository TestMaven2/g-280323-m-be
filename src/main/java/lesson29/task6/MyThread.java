package lesson29.task6;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Main.counter.incrementAndGet();
        }
    }
}