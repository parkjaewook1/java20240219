package c02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = v1 - 10;

        if (v1 > 10) {
            System.out.println("굿");
//            int v2 = v1 - 10;

        }

        int v3 = v1 + v2 + 5;

        System.out.println(v3);
    }

}
