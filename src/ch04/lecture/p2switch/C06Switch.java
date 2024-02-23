package ch04.lecture.p2switch;

public class C06Switch {
    public static void main(String[] args) {
        String city = "";

        switch (city) {
            case "서울":
            case "인천":
                System.out.println("수도권입니다.");
                break;
            case "광주", "전주":

                System.out.println("호남권입니다.");
                break;
            case "대구":
            case "부산":
                System.out.println("영남권입니다.");

        }
        // 서울, 인천
        // 광주, 전주
        //대구, 부산
    }
}
