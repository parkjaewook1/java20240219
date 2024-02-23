package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("가위(1),바위(2),보(3) 를 선택하세요.\n");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);


//        System.out.println("user = " + user);  // 가위, 바위, 보
//        System.out.println("computer = " + computer);

        switch (user) {
            case 1 -> System.out.println("가위");
            case 2 -> System.out.println("바위");
            case 3 -> System.out.println("보");
        }


        switch (computer) {
            case 1 -> System.out.println("가위");
            case 2 -> System.out.println("바위");
            case 3 -> System.out.println("보");
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