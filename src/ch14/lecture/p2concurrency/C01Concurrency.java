package ch14.lecture.p2concurrency;

public class C01Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyRun r = new MyRun();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        System.out.println("r.getValue() = " + r.getValue());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // 여러 쓰레드가 하나의 객체의 상태를 바꾸려고 하지 말아라

        System.out.println("r.getValue() = " + r.getValue());

    }
}

class MyRun implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    @Override

    public void run() {
        for (int i = 0; i < 30000; i++) {
            value++;

        }

    }
}