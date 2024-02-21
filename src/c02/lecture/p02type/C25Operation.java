package c02.lecture.p02type;

public class C25Operation {
    public static void main(String[] args) {
        // 정수간 연산의 결과는 정수
        int a = 10;
        int b = 2;
        int c = a / b; //5
        System.out.println("c = " + c);

        int d = 10;
        int e = 3;
        double f = (double) d / e;  //3
        System.out.println("f = " + f);
    }
}
