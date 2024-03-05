package quiz;

import java.util.Scanner;

public class jaewook20240305복습 {

    // Switch문
    public static void main(String[] args) {
//        {
//            char grade = 'c';
//
//            switch (grade) {
//                case 'b' -> {
//                    System.out.println("b라구요?");
//                }
//                case 'c' -> {
//                    System.out.println("c라구요?");
//                }
//                default -> System.out.println("라구요?");
//            }
//        }
//        //while문
//
//        Scanner scanner = new Scanner(System.in);
//        boolean a = true;
//        int speed = 0;
//
//        while (a) {
//            System.out.println("------------------------------");
//            System.out.println("1.증속\t | 2.감속\t | 3.중지 ");
//            System.out.println("------------------------------");
//            System.out.println("선택");
//
//            String str = scanner.nextLine();
//
//            if (str.equals("1")) {
//                speed++;
//                System.out.println("현재속도 = " + speed);
//
//            } else if (str.equals("2")) {
//                speed--;
//                System.out.println("현재속도 = " + speed);
//            } else if (str.equals("3")) {
//                a = false;
//            }
//
//        }
//        System.out.println("프로그램 종료");
//

        int n = 1234;
        int[] aq = new int[1234];


        int answer = 0;

        for (int i = 0; i < aq.length; i++) {
            answer += aq[i];
        }
        System.out.println(answer);
    }
}


