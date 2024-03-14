package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        C05MyInterface obj1 = (int x, int b) -> System.out.println(x / b);
        C05MyInterface obj2 = (int a, int b) -> System.out.println(a % b);
        obj1.method(5, 3);   //  5를 3으로 나눈 몫 출력 (/)
        obj2.method(5, 3);   // 5를 3으로 나눈 후의 나머지 출력  (%)
    }
}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}