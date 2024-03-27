package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) throws IOException {
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사
        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        Reader reader = new FileReader(src);
        Writer writer = new FileWriter(des);
        try (reader; writer) {
            char[] chars = new char[50];
            int len = 0;
            while ((len = reader.read(chars)) != -1) {
                writer.write(chars, 0, len);
            }
            writer.flush();

        }
    }
}