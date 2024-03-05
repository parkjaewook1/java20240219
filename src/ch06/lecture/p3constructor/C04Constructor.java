package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass o1 = new C04MyClass("park", 33);
        C04MyClass o2 = new C04MyClass("lee", 21);

    }
}

class C04MyClass {
    String name;

    int age;

    C04MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
}
