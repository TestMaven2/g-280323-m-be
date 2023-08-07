package lesson11.task3;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

        // Метод peek получает первый элемент из очереди,
        // при этом удаления из очереди этого элемента не происходит.
        Integer current = queue.peek();
        System.out.println("Текущий элемент - " + current);
        System.out.println(queue);

        // Метод poll в отличие от метода peek удаляет полученный элемент из очереди.
        current = queue.poll();
        System.out.println("Текущий элемент - " + current);
        System.out.println(queue);

        // Метод isEmpty проверяет, пустая ли очередь, возвращает true, если очередь пустая.
        System.out.println("Пустая ли очередь? - " + queue.isEmpty());
    }
}
