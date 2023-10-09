package lesson29.task2;

import java.io.FileWriter;

public class FileService {

    public synchronized static void writeToFile(String text) {

        try (FileWriter writer = new FileWriter("test.txt", true)) {
            writer.write(text);
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}