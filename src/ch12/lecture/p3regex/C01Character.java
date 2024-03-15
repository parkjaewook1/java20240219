package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식 : 특정 규칙의 문자열을 표현하기 위한 문자열 패턴
        // 한 문자
        String pattern1 = "a";
        boolean b1 = "a".matches(pattern1); //true
        System.out.println("b1 = " + b1);

        System.out.println("b".matches(pattern1));  //false
        System.out.println("aa".matches(pattern1)); //false
        System.out.println("aa".matches("aa"));
        System.out.println("ab".matches("aab"));
        System.out.println("ab".matches("ba"));
        System.out.println("\\".matches("\\\\"));   //true

        // regex . : 모든 문자
        System.out.println(".".matches("."));   //true
        System.out.println("C".matches("."));
        System.out.println("abc".matches("."));

        System.out.println(".".matches("\\."));
        System.out.println("a".matches("\\."));

        // 대소문자 구분함

        System.out.println("a".matches("a"));   //true
        System.out.println("a".matches("A"));   //false
        System.out.println("A".matches("a"));   //false

    }
}
