package quiz.test;

public class jaewook20240311 {
}

interface Animal {
    public void cry();
}

class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("월월");
    }
}
