package ch18.lecture.p5filter;

import java.io.*;

public class C04BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "temp/bigfile/output2.data";
        OutputStream os = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[10];

        long start = System.currentTimeMillis();
        for (int i = 0; i < (1024 * 1024 * 100); i++) {
            bos.write(data);
        }
        os.flush();
        os.close();

        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("time = " + time);
    }
}

// time = 856301300
// time = 856301300
// time = 885527900
// time = 1033843700