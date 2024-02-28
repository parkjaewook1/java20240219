package quiz;

public class jaewook20240228 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world"};
        int x = strlist.length;
        int[] y = new int[x];

        for (int i = 0; i < x; i++) {
            y[i] = strlist[i].length();
        }

        System.out.println(y);
    }
}


