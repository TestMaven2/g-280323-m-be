package lesson29.task8;

public class Beta {

    private Alpha alpha;

    public void setAlpha(Alpha alpha) {
        this.alpha = alpha;
    }

    public synchronized void methodA() {
        System.out.printf("Поток %s выполняет метод A класса Beta%n", Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
        System.out.printf("Поток %s закончил выполнение метода A класса Beta%n", Thread.currentThread().getName());

        alpha.methodB();
    }

    public synchronized void methodB() {
        System.out.printf("Поток %s выполняет метод В класса Beta%n", Thread.currentThread().getName());
    }
}