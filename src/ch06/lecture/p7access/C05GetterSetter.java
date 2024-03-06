package ch06.lecture.p7access;

public class C05GetterSetter {
}

class C05MyClass {
    private String name;

    private String ssn;

    private int age;

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
