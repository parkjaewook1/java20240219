package ch07.exercise.p07;

class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public String getName() {
        return name;
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child() call");

    }
}


