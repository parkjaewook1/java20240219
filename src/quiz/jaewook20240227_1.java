package quiz;

import java.util.Scanner;

public class jaewook20240227_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름");
        var name = scanner.nextLine();

        System.out.println("나이");
        var age = scanner.nextLine();

        System.out.println("주소");
        var add = scanner.nextLine();

        System.out.println(STR."저는 \{name} 입니다. 나이는\{age} 이고, 주소는\{add}");

        scanner.close();

    }
}
