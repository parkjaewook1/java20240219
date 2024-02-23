package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1),바위(2),보(3) 를 선택하세요.\n");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);


//        System.out.println("user = " + user);  // 가위, 바위, 보
//        System.out.println("computer = " + computer);

        if (user == 1) {
            System.out.println("가위");
        } else if (user == 2) {
            System.out.println("바위");
        } else {
            System.out.println("보");
        }


        if (computer == 1) {
            System.out.println("가위");
        } else if (computer == 2) {
            System.out.println("바위");
        } else if (computer == 3) {
            System.out.println("보");
        }

        if (user > computer) {
            System.out.println("승리");
        } else if (computer > user) {
            System.out.println("패배");
        } else {
            System.out.println("비김");
        }

    }
}