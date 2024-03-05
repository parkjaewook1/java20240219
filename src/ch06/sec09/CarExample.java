package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐", "빨강");
        Car yourCar = new Car("벤츠", "검정");
        Car DadCar = new Car("쏘나타", 3);

        myCar.run();
        yourCar.run();
        DadCar.run();

    }
}
