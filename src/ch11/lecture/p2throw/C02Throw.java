package ch11.lecture.p2throw;

public class C02Throw {
    public static void main(String[] args) {


        someMethod1();

        System.out.println();
    }

    public static void someMethod1() {

//        RuntimeException e = new RuntimeException();
        throw new RuntimeException();

//            throw e;
    }

}
