package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        //^ (caret) : 시작
        // $ : 끝

        String s1 = ",,abc,def,,,xyz,,,";
        String s = s1.replaceAll(",+", "");
        System.out.println("s = " + s);

        String s2 = ",,abc,def,,,xyz,,,";
        String s3 = s1.replaceAll(",+", "");
        System.out.println("s = " + s);
    }
}
