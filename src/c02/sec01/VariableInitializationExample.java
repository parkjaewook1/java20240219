package c02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
    int hour = 5;
    int minute = 7;

        System.out.println(hour + "시간" + minute + "분");

        int totalhour = (hour * 60) + minute;

        System.out.println("총" + totalhour + "분");
    }
}

