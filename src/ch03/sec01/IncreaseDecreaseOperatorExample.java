package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {

        // x++ 이전값 저장  ++x 1상승 후 값 저장
        // x-- 이전값 저장  --x 1하락 후 값 저장

        int x = 10;
        int y = 10;
        int z;

        x++;            //11
        ++x;            //12
        System.out.println("x = " + x);

        System.out.println("-----------------------------");
        y--;                //9
        --y;                //8
        System.out.println("y = " + y);

        System.out.println("---------------------------");
        z = x++;        //z = 12   x=  13
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---------------------------");

        z = ++x;     //z =  13   x = 14
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---------------------------");
        z = ++x + y++;      //z = 23    x = 15   y = 9
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
