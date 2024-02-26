package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            int num1 = (int) (Math.random() * 6) + 1;
            System.out.println(num1);
            if (num1 == 5) {
                break;
            }

        }
        System.out.println("프로그램 종료");
    }
}
