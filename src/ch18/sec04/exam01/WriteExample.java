package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("temp/test5.txt");

            char a = 'A';
            writer.write(a);
            char b = 'b';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
