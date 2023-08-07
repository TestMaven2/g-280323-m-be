package lesson11.task1;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("study");
        stack.push("Java");

        System.out.println(stack);

        // Метод peek позволяет получить элемент с вершины стека,
        // при этом не удаляя его из стека
        String current = stack.peek();
        System.out.println("Текущий элемент с вершины стека - " + current);
        System.out.println(stack);

        // В отличие от метода peek метод pop удаляет элемент с вершины стека
        current = stack.pop();
        System.out.println("Текущий элемент с вершины стека - " + current);
        System.out.println(stack);

        // Метод empty позволяет узнать, пустой ли стек.
        // Если стек пустой, метод возвращает true.
        System.out.println("Пустой ли стек? - " + stack.empty());

        // Метод search возвращает порядковый номер объекта в стеке, начиная с вершины.
        // Если указанный объект в стеке отсутствует, то метод search возвращает -1.
        System.out.println("Ищем в стеке элемент World - " + stack.search("World"));
        System.out.println("Ищем в стеке элемент study - " + stack.search("study"));
        System.out.println("Ищем в стеке элемент Java - " + stack.search("Java"));
    }
}
