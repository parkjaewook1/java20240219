package quiz;

import java.util.Scanner;

public class jaewook20240306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean num = true;
        while (num) {
            System.out.println("""
                    출석 하시겠습니까?              
                    1. 예   2.아니요
                    """);


            String yes = scanner.nextLine();
            switch (yes) {
                case "예" -> {
                    System.out.println("1.학생 2. 교사 3. 감독");
                }
            }
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> {
                    System.out.println("학생입니다.");


                }
                case "2" -> {
                    System.out.println("교사입니다.");


                }
                case "3" -> {
                    System.out.println("감독입니다");
                }
                case "4" -> {
                    System.out.println("취소하셨습니다");
                    num = false;
                }
            }
        }

    }
}
