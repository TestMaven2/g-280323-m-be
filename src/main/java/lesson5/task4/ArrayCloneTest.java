package lesson5.task4;

public class ArrayCloneTest {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2},
                           {3, 4}};

        System.out.println("Элемент исходного массива - " + numbers[1][1]);

        int[][] copy = numbers.clone();
        copy[0] = numbers[0].clone();
        copy[1] = numbers[1].clone();
        copy[1][1] = 7;

        System.out.println("Элемент исходного массива - " + numbers[1][1]);
        System.out.println("Элемент скопированного массива - " + copy[1][1]);
    }
}
