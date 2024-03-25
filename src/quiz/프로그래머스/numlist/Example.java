package quiz.프로그래머스.numlist;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                a++;
            } else {
                b++;
            }

            answer[0] = a;
            answer[1] = b;

        }
        System.out.println(answer);
        
    }
}
