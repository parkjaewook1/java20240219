package ch15.exercise.p9;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keys = map.keySet();
        for (String key : keys) {
            int score = map.get(key);
            System.out.println(key + ":" + score);

            totalScore += score;

            if (score > maxScore) {
                maxScore = score;
                name = key;
            }


        }
        double averageScore = (double) totalScore / map.size();

        System.out.println("평균 점수: " + averageScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }

}
