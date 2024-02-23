package ch02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        // java 21 version
        // string template

        String name = "jose";
        String age = "27";

        // my name is jane and age is 30

        System.out.println("my name is :" + name + "\nand age is :" + age);

        String desc3 = STR."my name is \{name} and age is \{age}";
        System.out.println(desc3);

        String address = "서울";
        String country = "한국";

        // 저는 한국에 있는 서울에 삽니다.
        String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다.";
        System.out.println(desc4);


    }
}
