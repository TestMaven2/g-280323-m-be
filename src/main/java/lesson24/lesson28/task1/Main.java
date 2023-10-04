package lesson24.lesson28.task1;

public class Main {

    public static void main(String[] args) {

        Thread anonymousThread = new Thread() {
            @Override
            public void run() {
                setName("Анонимный поток");
                for (int i = 0; i < 10; i++) {
                    // Имя потока: значение - 5.
                    System.out.printf("%s: значение - %d.%n", getName(), i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable runnable = () -> {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("Поток Runnable");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s: значение - %d.%n", currentThread.getName(), i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread daemonThread = new Thread() {
            @Override
            public void run() {
                setName("Демон поток");
                for (int i = 0; i < 10; i++) {
                    // Имя потока: значение - 5.
                    System.out.printf("%s: значение - %d.%n", getName(), i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        anonymousThread.start();
        new Thread(runnable).start();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}