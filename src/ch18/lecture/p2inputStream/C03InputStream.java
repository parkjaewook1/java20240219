package ch18.lecture.p2inputStream;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
    public static void main(String[] args) {
        String fileName = "temp/test.data";
        try (InputStream is = new FileInputStream(fileName)) {

            int data1 = is.read();

            byte[] datas = new byte[10];

            int len1 = is.read(datas);// 10bytes  읽고 배열에 쓰고 10리턴
            int len2 = is.read(datas); // 10bytes  읽고 배열에 쓰고 10리턴
            int len3 = is.read(datas); //  1bytes  읽고 배열에 쓰고 1리턴
            int len4 = is.read(datas); //  읽은 데이터 없고 -1 리턴

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);
            System.out.println("len4 = " + len4);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
