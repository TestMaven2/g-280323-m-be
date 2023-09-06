package lesson20.task5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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

        System.out.println(file.getAbsolutePath());

        File file2 = new File("C:/test.txt");
        System.out.println(file2.exists());

        InputStream in = new FileInputStream(file2);

        int read = in.read();

        while (read != -1) {
            System.out.print((char) read);
            read = in.read();
        }
    }
}
