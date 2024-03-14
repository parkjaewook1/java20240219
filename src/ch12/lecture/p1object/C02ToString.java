package ch12.lecture.p1object;

public class C02ToString {
    public static void main(String[] args) {
        Object o1 = new C02MyClass("son", 33, "London");
        System.out.println(o1.toString());
    }
}

class C02MyClass {
    private String name;
    private int age;
    private String address;

    public C02MyClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "C02MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // toString : 필드 값 정보를 리턴


}