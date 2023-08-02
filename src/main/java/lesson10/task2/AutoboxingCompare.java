package lesson10.task2;

public class AutoboxingCompare {

    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        boolean result = x == y;

        System.out.println("Результат сравнения примитивов - " + result);

        Integer integer1 = new Integer(5);

        result = x == integer1;

        System.out.println("Результат сравнения примитива и обёртки - " + result);

        Integer integer2 = new Integer(5);

        result = integer1 == integer2;

        System.out.println("Результат сравнения двух обёрток - " + result);
    }
}
