package ch04.Exercise;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        String grade = "B";

        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score1);
        System.out.println("-----------------------------------");

        int sum = 0;
        for (int i = 0; i <= 100; i += 3) {
            sum += i;

            System.out.println("-------------------");
        }


        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                boolean result = (4 * x) + (5 * y) == 60;
                if (result) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int money = 0;


        while (run) {

            System.out.println("------------------------------");
            System.out.println("1.예금 |  2.출금 | 3.잔고 | 4종료");
            System.out.println("------------------------------");
            System.out.print("선택>");

            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> {
                    System.out.println("예금액>");
                    String depositString = scanner.nextLine();
                    int deposit = Integer.parseInt(depositString);
                    money += deposit;
                }
                case "2" -> {
                    System.out.println("출금액>");
                    String withdrawalString = scanner.nextLine();
                    int withdrawal = Integer.parseInt(withdrawalString);
                    money -= withdrawal;

                }
                case "3" -> System.out.println(STR."잔고 \{money}");
                case "4" -> run = false;


            }
        }


        System.out.println("프로그램 종료");
        scanner.close();

    }
}

