package ch05.exercise;

import java.util.Scanner;

public class Exercise09each {
    public static void main(String[] args) {


        int[] scores = null;
        int n = 0;
        int m = 3;
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. 학생수\t|2.점수입력\t|3.점수리스트\t|4.분석\t|5.종료");
            System.out.println("-----------------------------------------------------------");
            System.out.print("선택>");
            String menu = scanner.nextLine();


            switch (menu) {
                case "1" -> {
                    System.out.println("학생수> ");
                    String numberStr = scanner.nextLine();
                    int number = Integer.parseInt(numberStr);
                    scores = new int[number];

                }
                case "2" -> {
                    // 점수 입력
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println(STR."scores[\{i}]>");
                        String scoreStr = scanner.nextLine();
                        int score = Integer.parseInt(scoreStr);
                        scores[i] = score;

                    }

                }
                case "3" -> {
                    // 점수 리스트 출력
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println(STR."scores[\{i}: \{scores[i]}");

                    }

                }
                case "4" -> {
                    //최고 점수, 평균 점수 구하기
                    int max = 0;
                    double sum = 0;

                    for (int score : scores) {
                        max = score > max ? score : max;
                        sum += score;
                    }

                    System.out.println("최고 점수" + max);
                    System.out.println("평균 점수" + (sum / scores.length));

                }
                case "5" -> {
                    // 반복문 종료
                    run = false;
                }
            }


        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
