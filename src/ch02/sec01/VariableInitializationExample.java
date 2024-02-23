package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int hour = 5;
        int minute = 7;

        System.out.println(hour + "시간" + minute + "분");

        int totalhour = (hour * 60) + minute;

        System.out.println("총" + totalhour + "분");

        String x = "what did you do";
        System.out.println(x.indexOf("do"));
        System.out.println("-------------------------");


        String id1 = "123456-7891234";
        var id2 = "222222-28888888";
        var man = "남자";
        var women = "여자";

        if (man == "남자") {
            System.out.println(id1);
        } else {
            System.out.println(id2);
        }

        System.out.println(id1.substring(0, 8));
        System.out.println(id2.substring(0, 8));
    }
}

