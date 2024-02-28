package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 04. 참조타입 (배열복사 예제)
        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        //참조변수   참조값
        //arr1      = []        {]

        arr1[0] = 10;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = {2, 3, 5};
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);

        arr3[1] = 23;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
