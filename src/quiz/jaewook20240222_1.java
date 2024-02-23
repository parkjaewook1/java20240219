package quiz;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class jaewook20240222_1 {
    public static void main(String[] args) {
        ArrayList<String> qk = new ArrayList<String>();
//        qk.add(100);
        qk.add("빵");
        qk.add("소금");
        for (int i = 0; i < qk.size(); i++) {
            System.out.println(qk.get(i));
        }

        ArrayList<String> list = new ArrayList<String>();
//        list.add(123);
        list.add("asdf");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("-------------------------------------------------------------------------");

            HashMap map01 = new HashMap();
            map01.put("jose", "010 - 7101 - 3624");
            map01.put("park", "010-5555-5555");

            System.out.println(map01.get("jose"));
            System.out.println(map01.get("park"));


            HashMap<String, String> map02 = new HashMap<String, String>();
//        map02.put("age", 31);
            map02.put("mbti", "INFP");

            System.out.println(map02.get("mbti"));


            HashMap mp = new HashMap();
            mp.put("name", "박재욱");
            mp.put("number", "010-7101-3624");
            System.out.println(mp.get("name"));

            HashMap<String, String> wt = new HashMap<String, String>();                 //String이 두번 들어가는 이유는 키 와 데이터 두개가 들어가기 때문
            wt.put("name", "john");
            System.out.println(wt.get("name"));


            ArrayList<String> listt = new ArrayList<>();
            listt.add("빵");
            listt.add("물");
            listt.add("사과");
            System.out.println("listt = " + listt);

            listt.remove("물");
            System.out.println("listt after removal = " + listt);

            HashMap xx = new HashMap<>();
            xx.put("a", 34);
            xx.put("b", 55);
            System.out.println(xx.get("a"));
            xx.remove("b");
            System.out.println(xx);

            int n = 10;
            i = i * 2;
            for (i = 2; i <= n; i++) {
                System.out.println(n);
            }

        }
    }
}


