package lesson21.task1;

public class TryCatchTest {

    public static void main(String[] args) {

        System.out.println("Начало работы программы.");

        int x = 10;
        int y = 0;
        System.out.println("Вызываем метод div с параметрами " + x + " и " + y);

        int result;

        try { // try с ресурсами - try (открываем какой-то ресурс) {
            // Конструкция try с ресурсами гарантирует, что наш ресурс,
            // будет закрыт автоматически (мы можем не использовать блок finally для этого)
            result = div(x, y);
            // строка кода, которая может вызвать ошибку 1
            // строка кода, которая может вызвать ошибку 2

            // Например, в блоке try открываем соединение с базой данных
            // Здесь код, который работает с БД и может вызвать ошибку
        } catch (ArithmeticException e) {
            System.out.println("Получено сообщение об ошибке - " + e.getMessage());
            System.out.println("Для результата принято значение по умолчанию - 0");
            result = 0;
        } finally {
            // Закрываем соединение с БД,
            // независимо от того, возникла ошибка при работе с БД или нет
            System.out.println("Отработал блок finally");
        }

        System.out.println("Получен результат - " + result);
        System.out.println("Конец работы программы");
    }

    public static int div(int x, int y) {
        System.out.println("Метод div начал работу с параметрами " + x + " и " + y);
        int result = x / y;
        System.out.println("Метод div закончил работу с результатом - " + result);
        return result;
    }
}
