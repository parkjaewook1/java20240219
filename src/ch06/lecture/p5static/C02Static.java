package ch06.lecture.p5static;

import java.util.Arrays;
import java.util.Scanner;

public class C02Static {
    public static void main(String[] args) {
        // 대문자 = 클래스  소문자 = 참조변수
        Scanner scanner = new Scanner(System.in);
        int[] a = {3, 4};
        System.out.println(Arrays.toString(a));
    }
}
