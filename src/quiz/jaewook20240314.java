package quiz;


public class jaewook20240314 {
    public static void main(String[] args) {
        int sum = 0;
        int totalsum = 0;
        double totlavg = 0;
        int[][] n = {
                {3, 15, 44},
                {2, 10}

        };

        for (int i = 0; i < n.length; i++) {
            sum += n[i].length;
            for (int j = 0; j < n[i].length; j++) {

                totalsum += n[i][j];
            }

        }
        System.out.println(totalsum);

        totlavg = (double) totalsum / sum;
        System.out.println(totlavg);
    }

}





