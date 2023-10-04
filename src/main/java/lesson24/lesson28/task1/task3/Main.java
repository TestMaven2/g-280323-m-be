package lesson24.lesson28.task1.task3;

public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock();
        clock.start();

        System.out.println("Прерывался ли поток? - " + clock.isInterrupted());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Прошло 5 секунд");
        clock.interrupt();

        if (clock.isInterrupted()) {
            // Сделать что-то, если был вызван метод interrupt
        }
    }
}