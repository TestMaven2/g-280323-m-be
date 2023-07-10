package lesson7.task3;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("AAA");
        vector.add("BBB");
        vector.add("CCC");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
