package ch05.exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        double totalsum = 0;
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalsum += array[i][j];
                cnt++;


            }
        }
        System.out.println(totalsum);
        System.out.println(totalsum / cnt);

    }

}


