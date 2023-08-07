package lesson11.task4;

public class Main {

    public static void main(String[] args) {

        MyDeque deque = new MyArrayDeque();

        deque.addToHead(77);
        deque.addToHead(88);

        System.out.println(deque);
    }
}