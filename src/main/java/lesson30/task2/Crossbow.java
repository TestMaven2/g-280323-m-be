package lesson30.task2;

public class Crossbow {

    private int arrows = 10;
    private boolean isFire = true;

    public boolean isFire() {
        return isFire;
    }

    public synchronized void fire() {
        try {
            isFire = false;

            while (arrows > 0) {
                Thread.sleep(1000);
                System.out.printf("Произведён выстрел. Стрел осталось %d.%n", --arrows);
            }

            System.out.println("Стрелы закончились.");
            wait();
            System.out.println("Стрелы в колчан добавлены.");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void reload() {
        arrows += 10;
        System.out.printf("Метод reload добавил стрелы в колчан. Стрел - %d.%n", arrows);
        notify();
    }
}