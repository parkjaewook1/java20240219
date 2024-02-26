package quiz;

public class jaewook20240226 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {               //  0   1   1   2   2   2   3   3   3   3          0   0   0   0   0  | 1   1   1   1 | 2  2 2 | 3 3 |  4
            for (int j = 0; j < (i - 1); j++) {    //  0   0   1   0   1   2   0   1   2   3           0   1   2   3   4  | 0   1   2   3 | 0  1 2 | 0 1 |  0
                System.out.print("*");

            }
            for (int k = 0; k < (6 - i); k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
