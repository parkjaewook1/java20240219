package quiz.exercise.how;

import java.io.*;

public class ch01InputOutputExample {
    public static void main(String[] args) {
        String inputFile = "temp/test.data";
        String outputFile = "temp/test.data";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            int sum = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
                count++;
            }
            double average = (double) sum / count;

            writer.write("합계: " + sum + "\n");
            writer.write("평균: " + average + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
