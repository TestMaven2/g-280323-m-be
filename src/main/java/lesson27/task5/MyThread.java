package lesson27.task5;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 70000; i < 100000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                Main.counter();
        }
    }
}