package ch11.lecture.p3custom;

public class C04Custom {
    public static void main(String[] args) throws LackOfCaffeineException {
        method1();

    }

    public static void method1() throws LackOfCaffeineException {
        throw new LackOfCaffeineException("문고리 고장남");
    }
}

class LackOfCaffeineException extends Exception {
    LackOfCaffeineException() {

    }

    LackOfCaffeineException(String message) {
        super(message);

    }
}
