package lesson26.task6;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    /*
     4. Список студентов в сервисе должен храниться в виде Map, где ключ - ID студента, значение - сам студент.
//        5. При создании студента не должно быть возможности присвоить ему идентификатор, вместо этого идентификатор
//        должен присваиваться автоматически при создании студентов
//        (то есть первому мы присваиваем автоматически ID 1, второму 2 и так далее). Этот функционал должен быть реализован при помощи СтудентСервиса.
//        6. Также при создании студента он должен автоматически добавляться в список студентов в сервисе.
//        7. Методы сервиса должны:
    //                А. Возвращать список всех студентов.
//                Б. Возвращать количество студентов.
//                В. Возвращать количество студентов конкретной учебной степени (количество бакалавров или количество магистров).
//                Г. Возвращать средний возраст всех студентов.
//                Д. Возвращать средний возраст студентов конкретной учебной степени.
//                Е. Возвращать список студентов конкретной учебной степени.
//        8. Напишите модульные тесты на методы сервиса.
     */
    private Map<Integer, Student> studentMap = new HashMap<>();
    private int count = 1;

    public Student creatStudent(String name, int age, Degree degree) {
        Student student = new Student(count, age, name, degree);
        studentMap.put(count++, student);
        return student;
    }

    public List<Student> allStudent() {
        return new ArrayList<>(studentMap.values());
    }

    public int getCountStudent() {
        return studentMap.size();
    }

    public long getCountStudentByDegree(Degree degree) {
        return getListStudentByDegree(degree).size();
    }

    public double getAvgStudent() {
        return studentMap.values().stream()
                .mapToInt(x -> x.getAge())
                .average().orElse(-1);
    }

    public double getAvgStudentByDegree(Degree degree) {
        return studentMap.values().stream()
                .filter(x -> x.getDegree().equals(degree))
                .mapToInt(x -> x.getAge())
                .average().orElse(0);
    }

    public List<Student> getListStudentByDegree(Degree degree) {
        return studentMap.values().stream()
                .filter(x -> x.getDegree().equals(degree))
                .collect(Collectors.toList());
    }

}
