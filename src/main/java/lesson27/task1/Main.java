package lesson27.task1;

public class Main {

    public static void main(String[] args) {

        // Два способа создания отдельного потока:
        // 1. Наследование от класса Thread
        // 2. Реализация интерфейса Runnable

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        // Вызов метода run не создаёт отдельный поток,
        // при этом метод run отрабатывает точно так же,
        // как и любой другой вызванный метод в однопоточном режиме
//        thread1.run();
//        thread2.run();

        // 1 способ: просто вызываем метод start у нашего объекта
        thread1.start();

        // 2 способ: создаём объект класса Thread, в конструктор
        // этого объекта отправляем наш объект thread2, и у
        // объекта thread вызываем метод start
        Thread thread = new Thread(thread2);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Главный поток: " + i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
    }
}
