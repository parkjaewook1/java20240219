package ch07.exercise.p06;

public class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;


    }

}

class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.name = name;
        this.studentNo = studentNo;
    }
}

