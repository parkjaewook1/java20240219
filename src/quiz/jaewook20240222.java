package quiz;

import java.util.Arrays;

public class jaewook20240222 {
    public static void main(String[] args) {

        int pencils = 534;
        int students = 30;


        int pencilsPerStudent = pencils / students;
        System.out.println("pencilsPerStudent = " + pencilsPerStudent);

        int pencilsLeft = (pencils % students);
        System.out.println("pencilsPerStudent = " + pencilsLeft);


        int value = 365;
        System.out.println("---------------------------3번문제------------");


        for (int i = 0; i < 100; i++) {

            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------------------");

        int[] price = {12000, 35000, 6000, 8400, 430000};
//        int[] price = new int[]{ 12000, 35000, 6000, 8400, 430000 };

        String[] mbti = {"INFP", "ENFP", "ISTJ", "ESTJ"};
//        String[] mbti = new int[]{ "INFP", "ENFP", "ISTJ", "ESTJ" };


        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(mbti));

        System.out.println(price.length);
        System.out.println(mbti.length);


        for (int i = 0; i < mbti.length; i++) {

            System.out.println(mbti[i]);
        }


        int[] fk = {1234, 4444, 34124};
        System.out.println(Arrays.toString(fk));

        System.out.println(fk.length);

        for (int i = 0; i < fk.length; i++) {
            System.out.println("i = " + i);
        }
    }
}


