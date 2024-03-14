package ch12.lecture.p1object;

public class C05HashCode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;
        int s1 = o1.hashCode();
        int s2 = o2.hashCode();
        int s3 = o3.hashCode();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3 == s2);


    }
}
