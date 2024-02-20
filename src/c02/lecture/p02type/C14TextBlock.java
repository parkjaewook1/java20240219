package c02.lecture.p02type;

public class C14TextBlock {
    public static void main(String[] args) {
        /*
        <html>
            <head>
            </head>
            <body>
            </body>
         */

        //text block
        // """로 묶음
        // newline 따옴 표등을 탈출문자 없이 사용 가능
        // 가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html2 = """
                 <html>
                            <head>
                            </head>
                            <body>
                            </body>
                            </html>
                """;
        System.out.println(html2);
    }
}
