package lesson27.task5;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 30000; i < 70000; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    counter();
            }
        });
        Thread thread2 = new Thread(new MyThread());

        thread1.start();
        thread2.start();

        for (int i = 2; i < 30000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                counter();
        }

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total numbers of prime: " + count);
    }

    public static synchronized int counter() {
        return count++;
    }
}