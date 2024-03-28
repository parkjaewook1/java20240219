package ch18.lecture.p5filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        String file1 = "temp/bigfile/output1.data";
        OutputStream os = new FileOutputStream(file1);

        byte[] data = new byte[8192 * 10];

        long start = System.currentTimeMillis();

        for (int i = 0; i < (1024 * 1024 * 100); i++) {
            os.write(data);
        }
        os.flush();
        os.close();

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time = " + time);

    }
}
// time = 3024618000
// time = 2947777100
// time = 3013440700
// time = 3076201600
