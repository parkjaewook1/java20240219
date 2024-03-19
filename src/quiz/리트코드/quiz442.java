package quiz.리트코드;

import java.util.ArrayList;
import java.util.List;

public class quiz442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (list.add(num)) {


                List<Integer> next = new ArrayList<>();
                next.add(num);
            }
        }


    }
}
