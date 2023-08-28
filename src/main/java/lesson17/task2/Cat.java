package lesson17.task2;

public class Cat {

    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Кот: возраст - %d, цвет - %s, вес - %.2f", age, color, weight);
    }
}
