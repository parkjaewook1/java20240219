package quiz.exercise.how;

import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력한 값을 출력합니다.");
        String inputLine = scanner.nextLine();

        String upperCaseLine = inputLine.toUpperCase();

        System.out.println(upperCaseLine);
        scanner.close();
    }
}
