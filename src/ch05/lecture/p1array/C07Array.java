package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {

        // 배열 전체 탐색
        // 향상된 for 문
        int[] arr = new int[]{6, 5, 7, 10, 88, 9};

        // 고전적인 방법
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------");

        // 향상된(enhanced)for 문
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
