package lesson28.task1.task3;

public class Clock extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Тик");
                Thread.sleep(1000);
                System.out.println("Так");
            } catch (InterruptedException e) {
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}