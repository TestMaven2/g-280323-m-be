package lesson27.task4;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 2; i < 100000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        // 9592
        System.out.println("Total numbers of prime: " + count);
    }
}
