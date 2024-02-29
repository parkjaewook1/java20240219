package ch05.exercise;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 8, 2};
        int max = array[0];


        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);


    }

}
