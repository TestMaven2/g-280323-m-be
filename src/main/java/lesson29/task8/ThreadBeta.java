package lesson29.task8;

public class ThreadBeta extends Thread {

    private Beta beta;

    public ThreadBeta(Beta beta) {
        this.beta = beta;
        setName("Beta");
    }

    @Override
    public void run() {
        beta.methodA();
    }
}