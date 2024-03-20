package quiz.리트코드;

import java.util.LinkedList;
import java.util.Queue;

public class quiz1700 {
    public static void main(String[] args) {


        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {

            queue.offer(students[i]);
        }


//        while (!queue.isEmpty()) {
//            Queue queue = queue.poll();
//            if (queue == sandwiches) {
//                return queue;
//            }
    }
}




