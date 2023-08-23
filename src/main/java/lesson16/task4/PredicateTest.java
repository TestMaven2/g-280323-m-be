package lesson16.task4;

import lesson16.task1.Degree;
import lesson16.task1.Student;
import lesson16.task1.StudentUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Дмитрий", 25, 3, 4.76, Degree.MASTER));
        students.add(new Student("Алина", 22, 5, 4.32, Degree.BACHELOR));
        students.add(new Student("Анастасия", 29, 2, 4.91, Degree.BACHELOR));
        students.add(new Student("Сергей", 19, 2, 4.12, Degree.MASTER));
        students.add(new Student("Александр", 31, 1, 3.98, Degree.BACHELOR));
        students.add(new Student("Иннокентий", 26, 3, 4.51, Degree.BACHELOR));
        students.add(new Student("Анна", 22, 4, 3.86, Degree.MASTER));

        Predicate<Student> predicate = x -> x.getName().startsWith("А");
        StudentUtils.printFilteredStudents1(students, predicate);
    }
}
