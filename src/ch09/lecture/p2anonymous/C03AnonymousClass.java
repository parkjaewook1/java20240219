package ch09.lecture.p2anonymous;

public class C03AnonymousClass {
    public static void main(String[] args) {
        C03Parent obj = new C03Parent() {
            @Override
            void method() {
                System.out.println("C03AnonymousClass.method");

            }
            // 추상메소드 꼭 재정의
        };
        obj.method();

    }
}

abstract class C03Parent {
    abstract void method();
}

