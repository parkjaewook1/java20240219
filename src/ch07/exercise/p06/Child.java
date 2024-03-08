package ch07.exercise.p06;

import ch07.exercise.p07.Parent;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}
