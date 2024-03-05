package ch06.lecture.p1field;

public class C02Field {
    public static void main(String[] args) {
        C02Car car1 = new C02Car();

        car1.color = "black";     //color 변수
        car1.weight = 999.99;


        C02Car car2 = new C02Car();
        car2.color = "white";
        car2.weight = 888.88;
        System.out.println(car1.color);
        System.out.println(car1.weight);
    }
}
