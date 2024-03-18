package quiz.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jaewook20240318test {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        int max = 0;
        List<Integer> candyList = Arrays.stream(candies).boxed().toList();

        for (Integer item : candyList) {
            max = Math.max(max, item);
        }


        // 새 List 만들기
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candyList.size(); i++) {
            if (candyList.get(i) + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }

        }
        System.out.println(result);

    }


    // 배열을 탐색해서 각 아이템과 extraCandies를 더한 값이
    // 위에서 찾은 최고값보다 크거나 같으면 true
    //                               아니면 fasle
    // List에 추가 (add)

    // 완성된 List를 리턴
}
