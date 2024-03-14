package ch12.lecture.p2wrapper;

import java.util.Arrays;

public class C05Compare {
    public static void main(String[] args) {
        int a = 60000;
        int b = 60000;

        System.out.println(a == b); // ture

        Integer c = 70000;  // auto boxing
        Integer d = 70000;  // auto boxing

        System.out.println(c == d);
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        // *************중요 !**********************
        // 참조타입 비교는 equals 사용!!
        // *************중요 !**********************
        System.out.println(c.equals(d));    // true


    }
}
