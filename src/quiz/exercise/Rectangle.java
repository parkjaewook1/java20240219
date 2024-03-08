package quiz.exercise;


class Rectangle extends Shape {

    private final double width;

    private final double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."가로 \{width}, 세로 \{height}인 사각형의 넓이는 \{area} 입니다";
    }

    private double getArea() {
        double area = width * height;
        return area;
    }
}