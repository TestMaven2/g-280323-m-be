package lesson21.task3;

import java.io.*;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        File outFile = new File("output.txt");

        try (InputStream in = new FileInputStream("test.txt");
             OutputStream out = new FileOutputStream(outFile, true)) {

            outFile.createNewFile();

            int data = in.read();

            while (data != -1) {
                out.write(data);

                if ((char) data == '!') {
                    in.skip(8);
                }
                data = in.read();
            }

            out.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("Ошибка работы с файлами");
        }
    }
}
