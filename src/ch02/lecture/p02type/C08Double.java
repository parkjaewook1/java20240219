package ch02.lecture.p02type;

public class C08Double {
    public static void main(String[] args) {
        //  double
        //  실수 표현 타입
        //  8byte == 64bits

        double a = 3.141592;
        double b = 4545545.12235;
        double c = -35641445.1592;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 근사한 값 저장
        double d = 12312312312.123213213213;
        System.out.println("d = " + d);

//        E = 10 의 몇승

        double f = 3.141592e2; //314.1592   3.141592 * 10^2
        System.out.println(f);

    }
}
