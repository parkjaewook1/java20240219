package ch07.exercise.p07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        System.out.println(parent.hashCode());
        System.out.println(child.hashCode());


    }
}
