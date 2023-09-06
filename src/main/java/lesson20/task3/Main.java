package lesson20.task3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        System.out.println("Вызываем метод");
        div(10, 0);
        System.out.println("Конец работы программы");
    }

    public static void div(int x, int y) {
        System.out.println("Начало работы метода");

        System.out.println("Осуществляем проверку делителя");
        if (y == 0) {
            System.err.println("Ошибка! Делитель не может быть равен нулю");
            y = 1;
        }

        int result = x / y;
        System.out.println("Метод завершил работу");
        System.out.println("Результат - " + result);
    }
}
