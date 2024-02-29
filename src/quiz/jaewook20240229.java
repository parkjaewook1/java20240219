package quiz;

import java.util.Scanner;

public class jaewook20240229 {
    public static void main(String[] args) {
//        String my_string = "happy";
//        String answer = "";
//        for (int i = my_string.charAt() - 1; i >= 0; i--) {
//            answer += my_string.charAt(i);
//        }
//        System.out.println(answer);
        int age;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름");
        name = scanner.nextLine();
        System.out.println("나이");
        age = scanner.nextInt();
        System.out.printf("나이는 %d입니다.%n", age);
        System.out.printf("이름은 %s입니다.%n", name);

    }

}
