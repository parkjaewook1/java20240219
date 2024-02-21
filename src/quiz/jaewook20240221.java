package quiz;

public class jaewook20240221 {
    public static void main(String[] args) {

        int a = 13;         // &&  둘 중 하나라도 틀리면 false
        int b = 14;         // ||  둘 중 하나라도 맞으면 true
        int c = 12;

        System.out.println(a == b && a <= b);           // 결과 값 :  false
        System.out.println(a >= c || a <= c);           // 결과 값 :  true
        System.out.println("----------------------1번--------------------------");

        String ra = "예";
        String rb = "아니요";

        System.out.println("물을 끓이시겠습니까?");

        if (ra.equals(rb)) {
            System.out.println("가스를 확인하세요");

        } else {
            System.out.println("예: 물이 끓고 있습니다");
        }

    }
}


