package quiz;

import java.util.Arrays;

public class jaewook20240304 {
    public static void main(String[] args) {
        String my_string = "pyThon ";
        String answer = "";
        String[] result = my_string.toLowerCase().split("");
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
            answer += result[i];

        System.out.println(answer);


    }
}





