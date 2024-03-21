package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        List<String> list
                = List.of("java", "react", "spring", "sql");


        // allMatch
        boolean threeAndMore = list.stream()
                .allMatch(e -> e.length() >= 3);
        System.out.println("threeAndMore = " + threeAndMore);


        boolean lessTen = list.stream()
                .allMatch(e -> e.length() < 10);
        System.out.println("lessTen = " + lessTen);


    }
}
