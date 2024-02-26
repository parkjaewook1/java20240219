package ch04.lecture.p5break;

import java.util.Scanner;

public class C01Break {
    public static void main(String[] args) {
        // for, while, do-while
        // 반복문의 코드  블럭에서 break 실행시 반복문 종료


        boolean b = true;
        while (b) {
            System.out.println("qqq1");
            System.out.println("qqq2");
            System.out.println("qqq3");
            break;
        }
        System.out.println("q");
    }
}
