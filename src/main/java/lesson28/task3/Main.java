package lesson28.task3;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.start();

        Timer timer1 = new Timer();
        timer1.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {

        }

        timer.stopTimer();
        timer1.stopTimer();
    }
}