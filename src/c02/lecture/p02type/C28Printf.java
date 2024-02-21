package c02.lecture.p02type;

public interface C28Printf {
    public static void main(String[] args) {
        // System.out.printf()

        // 파라미터 1개 (priint와 유사)
        System.out.printf("hello world!");

        System.out.println();

        // 파라미터 2개
        // 첫번째 파라미터 문자열에 두번째, 세번째, ..... 파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");

        System.out.println();

        //파라미터 3번개
        System.out.printf("hello %s and %s", "son", "park");

        System.out.println();

        String a = "son";
        String b = "park";
        System.out.println(STR."hello \{a} and \{b}"); //자바 21부터

        System.out.printf("%s %s-%s", "lee", "kang", "in");
        System.out.println();

        System.out.printf("%s %s %s ", "son", "lee", "park");
    }
}
