package c03.lecture.p1arithemetic;

import java.util.Scanner;

public class C02Arithmetic {
    public static void main(String[] args) {
//        // 증감연산자
//        // ++, --
//        // 피연산자 갯수 : 1개
//        // 연산의 결과타입 : 피연산자의 타입
//        // 연산의 결과값
//        // 1. 피연산자의 값 : 피연산자가 앞에 올 때
//        // 2. (피연산자의 값 + 1) 또는 (피연산자의 값 -1) : 피연산자가 뒤에 올 때
//
//        // *** 연산시 피연사자의 값이 1 증가 또는 1 감소
//
//        int a = 10;
//        int a1 = a++;
//        System.out.println("a1 = " + a1);
//        System.out.println("a = " + a);
//
//        int b = 10;
//        int b1 = ++b;
//        System.out.println("b1 = " + b1);
//        System.out.println("b = " + b);
//
//        int c = 10;
//        int c1 = c--;
//        System.out.println("c1 = " + c1);
//        System.out.println("c = " + c);
//
//        int d = 10;
//        int d1 = --d;
//        System.out.println("d1 = " + d1);
//        System.out.println("d = " + d);
//        System.out.println("----------------------------");


        Scanner scanner = new Scanner(System.in);

        System.out.print("물을 끓이시겠습니까? \n1 또는 2를 입력해주세요.\n  yes: 1\tno: 2 \n");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        while (true) {
            if (strX.equals("1")) {
                System.out.println("물이 끓습니다.");
                break;
            } else if (strX.equals("2")) {
                System.out.println("실행 안함");
                break;
            } else {
                System.out.println("1 또는 2를 입력해주세요.");
                strX = scanner.nextLine();
            }
        }


        System.out.print("면과 스프를 넣으시겠습니까? : \n1 또는 2를 입력해주세요.\n  yes : 1\tno: 2\n ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);


        System.out.println("물 끓는 중  ");
        System.out.println();

        while (true) {
            System.out.print("조리 완료! \n젓가락 챙기셨나요? ");
            String data = scanner.nextLine();
            if (data.equals("네")) {
                break;
            }
            System.out.println("출력 문자열 = " + data);
            System.out.println();
        }
        System.out.println("\n감사합니다.");

        scanner.close();
    }
}


