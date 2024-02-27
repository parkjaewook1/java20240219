package quiz;

import java.util.Scanner;

public class jaewook20240227 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 0; a < 100; a += 3) {
            sum += a;


        }
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);


        int[] a = {2, 3, 5, 6, 7, 8};
        int max = a[0];


        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }


            System.out.println(i);
        }
    }


//        int n = nums.length;
//        int[] result = new int[n*2];
//
//
//        for(int i = 0; i < n; i++){
//            result[i] = nums[i];
//            result[i+n] = nums[i];
//        }
//        return result;
}




















