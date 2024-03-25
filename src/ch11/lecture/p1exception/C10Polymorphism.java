package ch11.lecture.p1exception;

import java.util.List;

public class C10Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
