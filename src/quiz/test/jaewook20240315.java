package quiz.test;

import java.util.regex.Pattern;

public class jaewook20240315 {
    public static void main(String[] args) {
        String myString = "axbxcxdx";
        String[] answer = {};
        String regex = "[abc]+";
        boolean isMatch = Pattern.matches(regex, myString);
//        answer = isMatch;
        System.out.println(answer);


    }

}


