package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        System.out.println("a".matches("[abc]"));   //true
        System.out.println("b".matches("[abc]"));   //true
        System.out.println("c".matches("[abc]"));   //true
        System.out.println("A".matches("[abc]"));   //false     [abc] a, b, c 의미
        System.out.println("abc".matches("[abc]"));   //false


        String p1 = "[abc][abc][abc]";
        System.out.println("abc".matches(p1));
        System.out.println("bac".matches(p1));
        System.out.println("cab".matches(p1));
        System.out.println("ccc".matches(p1));
        System.out.println("bbb".matches(p1));
        System.out.println("aaa".matches(p1));

        String p2 = "[a-z]";
        System.out.println("a".matches(p2));
        System.out.println("s".matches(p2));
        System.out.println("z".matches(p2));
        System.out.println("b".matches(p2));
        System.out.println("Z".matches(p2));
        System.out.println("0".matches(p2));
        System.out.println("h".matches(p2));

        String p3 = "[a-zA-Z]";
        System.out.println("X".matches(p3));
        System.out.println("x".matches(p3));

        String p4 = "[a-zA-Z0-9]";  // 영문대소문자와 숫자
        String p5 = "[가-힣]";    //한글 한글자

        String p6 = "[^abc]";   // a, b, c 외

        System.out.println("a".matches(p6));    //false
        System.out.println("c".matches(p6));    //false
        System.out.println("d".matches(p6));    //true
        System.out.println("A".matches(p6));    //true
        System.out.println("8".matches(p6));    //true
        System.out.println("xyz".matches(p6));  //true

    }
}
