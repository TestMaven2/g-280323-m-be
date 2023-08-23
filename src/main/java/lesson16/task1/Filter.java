package lesson16.task1;

@FunctionalInterface
public interface Filter {

    boolean test(Student student);

    // Мы не можем добавить в функциональный
    // интерфейс второй абстрактный метод,
    // это будет ошибкой компиляции.
//    double test1(int value);

//    double test(int value);
}