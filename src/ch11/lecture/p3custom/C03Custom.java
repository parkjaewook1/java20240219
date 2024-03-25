package ch11.lecture.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        throw new BreakDoorHandleException("문고리가 고장남");
    }
}

// 직접 만드는 exception
// 1. Exception : checkedException
// 2. RuntimeException : uncheckedException
class BreakDoorHandleException extends RuntimeException {
    BreakDoorHandleException() {

    }

    BreakDoorHandleException(String message) {
        super(message);
    }

}
