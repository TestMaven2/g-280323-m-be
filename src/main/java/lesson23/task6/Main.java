package lesson23.task6;

public class Main {

    public static void main(String[] args) {

        Long l = 123L;
        Integer i = 34;
        Float f = 5.87f;
        Double d = 123.45;
        Byte b = 54;
        String s = "Hello!";

        NumberUtils<Long> utils = new NumberUtils<>(l);
        NumberUtils<Float> utils1 = new NumberUtils<>(f);
        NumberUtils<Integer> utils2 = new NumberUtils<>(i);
        NumberUtils<Double> utils3 = new NumberUtils<>(d);
        NumberUtils<Byte> utils4 = new NumberUtils<>(b);
//        NumberUtils<String> utils5 = new NumberUtils<>(s);

        utils.printIntegerValue();
        utils1.printIntegerValue();
        utils2.printIntegerValue();
        utils3.printIntegerValue();
        utils4.printIntegerValue();
//        utils5.printIntegerValue();
    }
}
