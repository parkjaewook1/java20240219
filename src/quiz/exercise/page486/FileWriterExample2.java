package quiz.exercise.page486;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write("java");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
