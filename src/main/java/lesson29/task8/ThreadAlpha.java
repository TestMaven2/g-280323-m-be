package lesson29.task8;

public class ThreadAlpha extends Thread {

    private Alpha alpha;

    public ThreadAlpha(Alpha alpha) {
        this.alpha = alpha;
        setName("Alpha");
    }

    @Override
    public void run() {
        alpha.methodA();
    }
}