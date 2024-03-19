package quiz.리트코드;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class quiz287 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!set.add(num)) {
                list.add(num);
            }
        }
        System.out.println(list);


    }
}