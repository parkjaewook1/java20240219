package ch07.lecture.p5super;

public class C03Super {

}

class C03Parent {
    // 파라미터 있는 생성자 만들면
    // 파라미터 없는 생성자가 자동 추가되지 않음

    public C03Parent(String name, int age) {

    }
}

class C03Child extends C03Parent {
    C03Child() {
//        super();
        super("홍", 3);
    }
}