package ch02.lecture.p02type;

public class C11Boolean {
    public static void main(String[] args) {
        // boolean (논리형, 부울형, 불리언)
        // true, false
        // 크기: 1byte 저장공간   true, false 두가지만 쓰면 되니까

        boolean a = false;
        boolean b = false;

        if (a) {
            System.out.println(" 안녕하세요 ");
        } else if (b) {
            System.out.println(" 반갑습니다.");
        } else {
            System.out.println(" 돌아가세요 ");
        }
        System.out.println(" 응답완료 ");
    }
}
