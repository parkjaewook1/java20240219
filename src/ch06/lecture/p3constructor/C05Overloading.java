package ch06.lecture.p3constructor;

public class C05Overloading {
    public static void main(String[] args) {
        C05MyClass o1 = new C05MyClass("park", 15);
        System.out.println(o1.name);
        System.out.println(o1.age);

        C05MyClass o2 = new C05MyClass("john");
        System.out.println(o2.name);
        System.out.println(o2.age);

        C05MyClass o3 = new C05MyClass("홍길동");
        System.out.println(o3.name);
        System.out.println(o3.age);


    }
}

class C05MyClass {
    String name;

    int age;

    // 파라미터의 타입, 갯수가 다르면 다른 생성자임

    C05MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }

    C05MyClass(String initialName) {
        name = initialName;
        age = 1;
    }

    C05MyClass(int initialAge) {
        name = "홍길동";
        age = initialAge;
    }

    C05MyClass() {
        name = "park";
        age = 1;
    }
}
