package ch06.lecture.p7access.pakage;

public class C06ReadOnly {
    public static void main(String[] args) {

        System.out.println();

        C06MyClass o1 = new C06MyClass("son", 33);
        System.out.println("o1.getName() =" + o1.getName());
        System.out.println("o1.getAge() =" + o1.getAge());
    }
}
// record   : 14버전 이후

record C06MyClass2(
        String name,
        int age
) {

}

class C06MyClass {
    private String name;

    private int age;

    public C06MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}




