package lesson31.task3;

public class FerryBoat implements Runnable {

    private long start = System.currentTimeMillis();

    @Override
    public void run() {
        try {
            System.out.println("Паром отошёл от берега.");
            Thread.sleep(3000);
            System.out.printf("Паром выгрузил автомобили, прошло времени - %d с.%n",
                    (System.currentTimeMillis() - start) / 1000);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}