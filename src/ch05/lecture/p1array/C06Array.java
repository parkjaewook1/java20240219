package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{7, 2, 8, 5, 20, 66, 90};


        // 배열의 길이
        System.out.println("arr.lengt =" + arr.length);
        System.out.println("-----------------------------");


        for (int i = 0; i < 7; i++) {

            System.out.println(arr[i]);
        }
    }
}
