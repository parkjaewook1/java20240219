package ch04.Exercise;

public class Exercise04 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            int sum = num1 + num2;
            if (sum == 5) {
                System.out.println("첫 번째 = " + num1 + "\t두번째 =" + num2 + "\t합 =" + sum);
                break;
            }
        }
        System.out.println("프로그램 종료");
        System.out.println("----------------------------------------");
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            System.out.println(STR."(\{num1}, \{num2})");

            if ((num1 + num2) == 5) {
                break;
            }
        }
//        boolean x = true;
//        while (x) {
//            int num1 = (int) (Math.random() * 6) + 1;
//            System.out.println(num1);
//            if (num1 == 5) {
//                break;
//            }
//
//        }
//        System.out.println("프로그램 종료");
    }
}
