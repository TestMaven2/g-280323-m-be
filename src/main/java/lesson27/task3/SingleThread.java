package lesson27.task3;

public class SingleThread {

    public static void main(String[] args) {

        int number = 5;
        int count = 0;

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0) {
                count++;
            }
        }

        System.out.println("Значение счётчика - " + count);
    }
}