package ch06.sec09;

public class Car {

    String model;
    String color;
    int level;
    int speed;

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, int level) {
        this.model = model;
        this.level = 3;

    }


    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
    }

}
