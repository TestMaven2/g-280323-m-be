package lesson16.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Дмитрий", 25, 3, 4.76, Degree.MASTER));
        students.add(new Student("Алина", 22, 5, 4.32, Degree.BACHELOR));
        students.add(new Student("Анастасия", 29, 2, 4.91, Degree.BACHELOR));
        students.add(new Student("Сергей", 19, 2, 4.12, Degree.MASTER));
        students.add(new Student("Александр", 31, 1, 3.98, Degree.BACHELOR));
        students.add(new Student("Иннокентий", 26, 3, 4.51, Degree.BACHELOR));
        students.add(new Student("Анна", 22, 4, 3.86, Degree.MASTER));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Фильтр: средний балл > 4, степень - Магистр");
        // Сергей, Дмитрий
        StudentUtils.printFilteredStudents(students, new FilterByRateAndDegree());

        System.out.println("Фильтр: возраст < 25, степень - Бакалавр");
        // Алина
        StudentUtils.printFilteredStudents(students, new FilterByAgeAndDegree());

        System.out.println("Фильтр: имя начинается на А, средний балл < 4.5");
        System.out.println("Используем анонимный класс:");
        // Алина, Александр, Анна
        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("А") && student.getAverageRate() < 4.5;
            }
        });

        System.out.println("Фильтр: Курс до 2 включительно, средний балл > 4");
        System.out.println("Используем анонимный класс:");
        // Анастасия, Сергей
        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() <= 2 && student.getAverageRate() > 4;
            }
        });

        System.out.println("Фильтр: имя 6 букв или длиннее, содержит букву И");
        System.out.println("Используем лямбда-выражение");
        // Дмитрий, Анастасия, Иннокентий

        StudentUtils.printFilteredStudents(students,
                x -> x.getName().length() >= 6 && x.getName().toLowerCase().contains("и"));

        System.out.println("Фильтр: курс - нечётный, возраст - чётный");
        System.out.println("Используем лямбда-выражение");
        // Алина, Иннокентий

        StudentUtils.printFilteredStudents(students,
                x -> x.getCourse() % 2 != 0 && x.getAge() % 2 == 0);

        System.out.println("Фильтр: степень - бакалавр, имя содержит букву С");
        // Анастасия, Александр

        Filter filter = x -> x.getDegree().equals(Degree.BACHELOR) && x.getName().toLowerCase().contains("с");

        StudentUtils.printFilteredStudents(students, filter);
        StudentUtils.printFilteredStudents(students, filter);
        StudentUtils.printFilteredStudents(students, filter);
    }
}