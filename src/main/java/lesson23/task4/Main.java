package lesson23.task4;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Hello", 7);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<Double, Double> pair1 = new Pair<>(2.7, 7.2);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
    }
}
