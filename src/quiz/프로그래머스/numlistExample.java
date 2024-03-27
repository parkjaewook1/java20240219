package quiz.프로그래머스;

import java.util.Arrays;

public class numlistExample {
    public static void main(String[] args) {
        int[] a = {12, 4, 15, 46, 38, 1, 14};
        int[] answer = {};
        int[] b = a;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[5]) {
                answer = new int[]{(b[i] = a[i])};

                System.out.println(Arrays.toString(answer));
            }


        }
    }
}
