package lesson19.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Есть список товаров
        // Отфильтровать товары таким образом, чтобы получить
        // список товаров дороже 100 единиц и без дубликатов

        List<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 90));
        products.add(new Product("Banana", 110));
        products.add(new Product("Potato", 70));
        products.add(new Product("Carrot", 80));
        products.add(new Product("Orange", 200));
        products.add(new Product("Lemon", 130));
        products.add(new Product("Orange", 220));

        // Banana, Orange, Lemon

        List<String> result = products.stream() // Получаем стрим продуктов
                .filter(x -> x.getPrice() > 100) // Фильтруем продукты по цене (на выходе стрим продуктов)
                .map(x -> x.getName()) // Стрим продуктов преобразуем в стрим String
                .distinct() // Из стрима String убираем дубликаты
                .toList(); // Стрим String преобразуем в лист

        System.out.println(result);
    }
}