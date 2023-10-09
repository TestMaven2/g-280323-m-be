package lesson28.task3;

public class Timer extends Thread {

    private boolean isStopped;

    public void stopTimer() {
        isStopped = true;
    }

    @Override
    public void run() {
        int seconds = 0;
        while (!isStopped) {
            System.out.println("Прошло секунд - " + seconds++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}