package quiz.리트코드;

import java.util.*;

public class quiz414 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        TreeSet<Integer> scores = new TreeSet<>();

        for (int s : nums) {
            scores.add(s);
            if (scores.size() > 3) {
                scores.remove(scores.first());
            }
        }

        // 3번째로 큰 수가 있으면 그 값을, 아니면 최대값을 출력
        System.out.println(scores.size() >= 3 ? scores.first() : scores.last());
    }
}
