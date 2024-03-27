package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02Reader {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("temp/output2.txt");
        int data = 0;

        while ((data = reader.read()) != -1) {
            char c = (char) data;

            System.out.println("c = " + c);
        }
    }
}
