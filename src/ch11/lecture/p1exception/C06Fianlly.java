package ch11.lecture.p1exception;

import java.util.List;

public class C06Fianlly {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));


        }
        System.out.println("모두 출려 완료");
    }
}
