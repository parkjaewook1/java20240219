package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다");
        }

        int x = 20;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        if (result1 == true) {
            System.out.println("굿");
        } else if (result2 == true) {
            System.out.println("예스");
        }
        System.out.println("correct");
//        System.out.println("result1 = " + result1);
//        System.out.println("result2 = " + result2);


    }
}
