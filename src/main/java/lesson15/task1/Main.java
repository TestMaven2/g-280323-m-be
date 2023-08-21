package lesson15.task1;

import lesson1.task3.Cat;

public class Main {

    public static void main(String[] args) {

        Object o = new Object();
        Comparable<Cat> catComparable = new Comparable<Cat>() {
            @Override
            public int compareTo(Cat o) {
                return 0;
            }
        };
    }
}
