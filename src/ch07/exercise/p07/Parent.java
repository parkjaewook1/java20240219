package ch07.exercise.p07;

public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent(String nation) call");
    }

    public Parent(String nation) {
        System.out.println("Parent(String nation) call");
    }

}

