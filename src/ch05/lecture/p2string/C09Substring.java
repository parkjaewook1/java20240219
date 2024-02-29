package ch05.lecture.p2string;

public class C09Substring {
    public static void main(String[] args) {
        //일부 문자 추출
        String s = "spring boot";

        //substring : 문자열의 일부분 리턴
        String s2 = s.substring(2, 5);//rin 종료 index 앞까지   end index -1
        System.out.println("s2 = " + s2);

        System.out.println(s.substring(7, 11));
        System.out.println(s.substring(7));
        System.out.println();
    }
}
