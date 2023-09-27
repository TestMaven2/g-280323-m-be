package lesson26.task6;
/*
 2. У студента должны быть характеристики:
 ID, имя, возраст, учебная степень (в виде Enum Degree - BACHELOR и MASTER).

 */
public class Student {
    private int id;
    private int age;
    private String name;
    private Degree degree;

    Student(int id, int age, String name, Degree degree) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.degree = degree;
    }

    Student() {

    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Degree getDegree() {
        return degree;
    }
}