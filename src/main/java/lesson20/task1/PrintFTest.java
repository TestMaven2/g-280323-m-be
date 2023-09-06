package lesson20.task1;

import lesson17.task2.Cat;

import java.util.Date;

public class PrintFTest {

    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three!");

        System.out.println();

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");

        // \n - позволяет перенести курсор на следующую строку
        // \\n - первый \ экранирует сочетание \n и переноса строки не происходит,
        // вместо этого метод просто выводит \n в консоль
        System.out.println("Служебные символы %n и \\n переносят информацию на следующую строку.");
        System.out.printf("One!%nTwo!\nThree!%n");

        System.out.println("Подставляем в строки целочисленные переменные.");
        int a = 12;
        int b = 27;
        System.out.printf("Сумма чисел %d и %d равна %d.%n", a, b, a + b);
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + (a + b) + ".");

        System.out.println("Подставляем в строки строки.");
        String hello = "Всем привет!";
        System.out.printf("Значение переданной строки - %s%n", hello);
        System.out.printf("Значение переданной строки - %.4s%n", hello);
        System.out.printf("Значение переданной строки - %.4S%n", hello);

        System.out.println("Подставляем в строки дробные значения");
        double pi = Math.PI;
        System.out.printf("Число ПИ равно - %f.%n", pi);
        System.out.printf("Число ПИ равно - %d.%n", (int) pi);
        System.out.printf("Число ПИ равно - %.3f.%n", pi);
        System.out.printf("Число ПИ равно - %.2f.%n", pi);

        System.out.println("Подставляем в строки boolean значения");
        boolean bool = true;
        System.out.printf("Значение boolean переменной - %b.%n", bool);
        System.out.printf("Значение boolean переменной - %B.%n", bool);
        System.out.printf("Равны ли a и b? - %b.%n", a == b);
        System.out.printf("Boolean значение - %b.%n", 15);
        System.out.printf("Boolean значение - %b.%n", 0);

        Cat cat = new Cat(3, "Black", 5);

        System.out.printf("Есть ли кот? - %b.%n", cat);
        cat = null;
        System.out.printf("Есть ли кот? - %b.%n", cat);

        System.out.println("Подставляем в строки символы");
        char ch = 'r';
        System.out.printf("Значение символа - %c.%n", ch);
        System.out.printf("Значение символа - %C.%n", ch);

        System.out.println("Ещё одна возможность для дробных чисел");
        double d1 = 123.456;
        double d2 = 123.456789123;
        System.out.printf("%50.3f%n", d1);
        System.out.printf("%50.9f%n", d2);

        Date date = new Date();
        System.out.println("Форматирование дат");
        System.out.println(date);
        System.out.printf("Значение времени - %tT.%n", date);
        // Часы - 10, минуты - 52, секунды - 41
        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS.%n", date, date, date);

        System.out.printf("%1$tA %1$td %1$tB %1$tY%n", date);
    }
}
