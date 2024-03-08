package quiz.exercise;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); //반지름 3
        Shape shape2 = new Rectangle(5, 7); // 가로5, 세로7
        shape1.printArea(); //  원의 면적 출력
        shape2.printArea(); //  사각형의 면적 출력

        printDescription(shape1);   // "반지름이 3인 원의 면적은 28.2748 입니다."
        printDescription(shape2);   // "가로 5, 세로 7인 사각형의 면적은 35 입니다.

    }

    public static void printDescription(Object o) {
        System.out.println(o.toString());
    }
}