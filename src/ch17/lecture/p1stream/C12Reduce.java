package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;

public class C12Reduce {
    public static void main(String[] args) {
        List<String> list1 = List.of("j", "a", "vm;");
        String reduce1 = list1.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("reduce1 = " + reduce1);

        Optional<String> reduce2 = list1.stream()
                .reduce((a, b) -> a + b);
        System.out.println("reduce2 = " + reduce2);

//        Optional
    }
}
