package lesson20.task5;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt");
        System.out.println("Существует ли файл? - " + file.exists());
        file.createNewFile();
        System.out.println("Существует ли файл? - " + file.exists());

        File file1 = new File("first/second/third/fourth/test.txt");
        System.out.println("Существует ли файл? - " + file1.exists());
//        file1.createNewFile();
        System.out.println("Существует ли файл? - " + file1.exists());

        File dir = new File("first");
        dir.mkdir();

        File dir1 = new File("first/second/third/fourth");
        dir1.mkdirs();
        file1.createNewFile();

        System.out.println("Является ли file файлом? - " + file.isFile());
        System.out.println("Является ли file папкой? - " + file.isDirectory());
        System.out.println("Является ли dir файлом? - " + dir.isFile());
        System.out.println("Является ли dir папкой? - " + dir.isDirectory());
    }
}
