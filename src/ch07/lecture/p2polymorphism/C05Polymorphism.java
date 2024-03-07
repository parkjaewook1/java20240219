package ch07.lecture.p2polymorphism;

public class C05Polymorphism {
    A a;

    C05Polymorphism() {
        a = new A();
        a = new B();
        a = new C();
    }

    public static void main(String[] args) {
        // 지역변수
        A a = new A();
        a = new B();
        a = new C();

        method(new A());
        method(new B());
        method(new C());
    }

    public static void method(A a) {

    }
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
    @Override
    public void method1() {
        System.out.println("C.method1");
    }
}