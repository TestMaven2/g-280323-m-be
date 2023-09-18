package lesson23.task6;

public class NumberUtils<T extends Number> {

    private T value;

    public NumberUtils(T value) {
        this.value = value;
    }

    // Задача метода - вывести в консоль int-значение переданного числа (например Double или Long)
    public void printIntegerValue() {
        System.out.println(value.intValue());
    }
}
