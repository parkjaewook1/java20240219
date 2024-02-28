package quiz;

import java.util.Arrays;

public class jaewook20240228 {
    public static void main(String[] args) {
        String[] strlist = {"operation", "cwal", "show me the money"};
        int[] answer = {};                  //answer[0] answer[1] answer[2]         = answer[i]     strlist.length
        answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        System.out.println(Arrays.toString(answer));
    }
}


