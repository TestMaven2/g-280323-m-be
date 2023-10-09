package lesson29.task7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTypeTest {

    public static void main(String[] args) {

        AtomicInteger atomic = new AtomicInteger();

        // Установка значения.
        atomic.set(5);

        System.out.println(atomic);

        // Получение значения.
        int result = atomic.get();
        System.out.println("Полученное значение - " + result);

        // Установка значения при определённом условии
        boolean result1 = atomic.compareAndSet(9, 15);
        System.out.println("Выполнена ли операция? - " + result1);
        System.out.println("Значение атомика - " + atomic);

        result1 = atomic.compareAndSet(5, 15);
        System.out.println("Выполнена ли операция? - " + result1);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        // Добавляем какое-то значение к текущему.
        result = atomic.addAndGet(7);
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        result = atomic.getAndAdd(7);
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        // Увеличение атомика на единицу
        result = atomic.incrementAndGet();
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        result = atomic.getAndIncrement();
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        // Уменьшение атомика на единицу
        result = atomic.decrementAndGet();
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        result = atomic.getAndDecrement();
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);

        System.out.println();

        // Установка нового значения в атомик
        result = atomic.getAndSet(50);
        System.out.println("Полученный результат - " + result);
        System.out.println("Значение атомика - " + atomic);
    }
}