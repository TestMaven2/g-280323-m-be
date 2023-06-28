package lesson4.task3;

import lesson4.task1.Cat;

public class AutoboxingTest {

    public static void main(String[] args) {

        int intValue = 7;
        Integer integerValue = 5;

        System.out.println("Сумма: " + (intValue + integerValue));

        double doubleValue = integerValue.doubleValue();

        // {5, 8, 2, 6, 7} - список целочисленных значений

        // Раньше надо было вот так (когда не было автоупаковки):
        Integer integer = new Integer(8);

        Cat cat = new Cat();

        // Автоупаковка:
        Integer integer1 = 5;
        // И это тоже автоупаковка (присваиваем в переменную типа Integer тип int)
        Integer integer2 = intValue;

        // Автораспаковка (присваиваем в переменную типа int тип Integer)
        int intValue1 = integer1;

        // Раньше надо было вот так (когда не было автораспаковки)
        int intValue2 = integer1.intValue();

        /*
        int -> Integer
        double -> Double
        byte -> Byte
        short -> Short
        long -> Long
        float -> Float
        boolean -> Boolean
        char -> Character
         */

        boolean b1 = true;
        // Автоупаковка:
        Boolean b2 = true;
    }
}
