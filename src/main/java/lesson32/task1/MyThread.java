package lesson32.task1;

import java.util.Random;

public class MyThread extends Thread {

    private int id;

    public MyThread(int id) {
        this.id = id;
        start();
    }

    @Override
    public void run() {
        Random random = new Random();
        int delay = random.nextInt(4000) + 1000;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(delay);
                Main.increment(id);
                System.out.printf("Поток %s увеличил значение на %d.%n", getName(), id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}