package lesson10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsSortTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 3, 21, 4.65));
        students.add(new Student("Peter", 1, 19, 4.23));
        students.add(new Student("Sidor", 4, 30, 3.98));
        students.add(new Student("Andrew", 5, 23, 4.65));
        students.add(new Student("Aleksandra", 5, 22, 4.43));
        students.add(new Student("John", 2, 22, 4.43));
        students.add(new Student("Max", 4, 22, 4.43));
        students.add(new Student("Alex", 4, 22, 4.43));
        students.add(new Student("Oksana", 4, 22, 4.43));
        students.add(new Student("Maksim", 1, 19, 4.43));
        students.add(new Student("Makar", 2, 25, 4.43));
        students.add(new Student("Natalia", 1, 25, 4.88));
        students.add(new Student("Sergey", 3, 32, 3.80));

        System.out.println("Исходный лист:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Collections.sort(students, new StudentComparator());

        System.out.println("Отсортированный лист:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Collections.sort(students);

        System.out.println("Отсортированный лист в естественном порядке (по умолчанию):");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
