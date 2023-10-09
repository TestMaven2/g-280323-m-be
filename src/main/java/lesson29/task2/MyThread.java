package lesson29.task2;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            FileService.writeToFile(String.format("<%s>: value - [%d]%n",
                    getName(), i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}