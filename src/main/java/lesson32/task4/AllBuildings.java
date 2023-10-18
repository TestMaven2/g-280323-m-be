package lesson32.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AllBuildings {

    public static void main(String[] args) {

        // Компания располагает техникой для строительства всех объектов одновременно

        String[] stages = {"1. Проектная деятельность",
                "2. Начало строительных работ",
                "3. Окончание строительных работ",
                "4. Отделочные работы",
                "5. Сдача объекта"};

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(new Building("Berlin", stages, false));
        service.execute(new Building("Dusseldorf", stages, false));
        service.execute(new Building("Essen", stages, false));
        service.execute(new Building("Dortmund", stages, false));

        service.shutdown();
    }
}