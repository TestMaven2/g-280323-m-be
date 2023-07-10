package lesson7.task6;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор, который возвращает чётные числа из переданной коллекции
 */
public class MyIterator implements Iterator<Integer> {


    public MyIterator(List<Integer> list) {

    }

    /**
     * Метод должен вернуть true, если в переданной коллекции ещё есть чётные числа
     */
    @Override
    public boolean hasNext() {
        return false;
    }

    /**
     * Вернуть следующее чётное число
     */
    @Override
    public Integer next() {
        return null;
    }
}