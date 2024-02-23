package quiz;

import java.util.Random;
import java.util.Scanner;

public class jaewook20240223 {
    public static void main(String[] args) {
        String team = "real";

        String club = switch (team) {
            case "man city", "chelse" -> "EPL";
            case "juven", "acm" -> "seria";

            case "real", "fcb" -> {
                System.out.println("soccer");
                yield "laliga";
            }

            default -> "team";

        };
        System.out.println("club = " + club);

        System.out.println("----------------------------------------------------------");


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(" 가위 바위 보! ");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        switch (user) {
            case 1 -> System.out.println("가위");
            case 2 -> System.out.println("바위");
            case 3 -> System.out.println("보");
        }
        switch (computer) {
            case 1 -> System.out.println("가위");
            case 2 -> System.out.println("바위");
            case 3 -> System.out.println("보");
        }

        if (user == computer) {
            System.out.println("비겼습니다");
        } else if (user == 1 && computer == 3) {
            System.out.println("승리");
        } else if (user == 2 && computer == 1) {
            System.out.println("승리");
        } else if (user == 3 && computer == 2) {
            System.out.println("승리");
        } else {
            System.out.println("패배");
        }


    }
}

