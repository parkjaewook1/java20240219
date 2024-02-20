package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bits
        // 0 ~ 65545

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d =65536;
//        char e =-1;
        char f = 9312;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println(f);

        int k = 127908;
        char[] emoji1 = Character.toChars(k);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        char q = '힣';
        char r = 12312;
        System.out.println("q = " + q);
        System.out.println("r = " + r);


    }
}
