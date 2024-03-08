package quiz.exercise;


class Round extends Shape {

    public final double n;


    public Round(double n) {
        this.n = n;

    }


    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."반지름이 \{n}인 원의 면적은 \{area} 입니다.";
    }

    private double getArea() {
        double area = n * n * Math.PI;
        return area;
    }
}