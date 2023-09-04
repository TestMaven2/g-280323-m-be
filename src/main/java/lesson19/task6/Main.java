package lesson19.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        0. Создать класс Employee
//        1. Вывести всех сотрудников без высшего руководителя
//        2. Сгруппировать сотрудников по должности
//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
//        4. Получить список сотрудников с зп > 1000
//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        6. Получить сотрудника с самой низкой зп
//        7. Получите сотрудников из всех отделов с максимальной зп

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 680.50));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 700));
        employees.add(new Employee("Ken", "Developer", 900));

        List<Employee> list1 = employees.stream()
                .filter(x -> !x.getPosition().equals("CEO"))
                .collect(Collectors.toList());

        System.out.println(list1);

        Map<String, List<Employee>> employeesByStaff = employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosition()));

        System.out.println(employeesByStaff);

        double middleSalary = employees.stream()
                .collect(Collectors.averagingDouble(x -> x.getSalary()));

        System.out.println(middleSalary);

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average salary: " + averageSalary);

        // secondOption
        double commandSalary1 = employees.stream()
                .map(x -> x.getSalary())
                .reduce((x1, x2) -> x1 + x2)
                .orElse(0.0);

        long totalMound = employees.stream()
                .count();

        System.out.println();
        System.out.println(commandSalary1 / totalMound);
        System.out.println();

        List<Employee> list3 = employees.stream()
                .filter(x -> x.getSalary() > 1000)
                .collect(Collectors.toList());

        System.out.println(list3);
        System.out.println();

        employees.stream()
                .filter(emp -> emp.getPosition().equals("Manager"))
                .forEach(emp -> emp.setSalary(emp.getSalary() * 1.15)); // Увеличение зп на 15%

        System.out.println(employees);
        System.out.println();

        Employee employee1 = employees.stream()
                .min((x1, x2) -> Double.compare(x1.getSalary(), x2.getSalary()))
                .orElse(null);

        System.out.println(employee1);
        System.out.println();

        Employee employee2 = employees.stream()
                .sorted((x1, x2) -> Double.compare(x1.getSalary(), x2.getSalary()))
                .findFirst()
                .orElse(null);

        System.out.println("Сотрудник с минимальной зарплатой");
        System.out.println(employee2);
        System.out.println();

        employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosition()))
                .forEach((x, y) -> y.stream()
                        .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                        .limit(1)
                        .forEach(System.out::println));
    }
}

