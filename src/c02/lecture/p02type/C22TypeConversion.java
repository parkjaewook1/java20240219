package c02.lecture.p02type;

public class C22TypeConversion {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 10;

        int intValue1 = byteValue;
        int intValue2 = charValue;
//        short shortValue = charValue; //x

        double doubleValue = byteValue;

        int intValue3 = 10;
        double doubleValue3 = 5.7;
        char charValue3 = 'A';
        String strValue3 = "A";

        double var1 = (double) intValue3;  //자동 타입 변환으로 가능
        byte var2 = (byte) intValue3;
        int var3 = (int) doubleValue3;
//        char var = (char) strValue3;

//        기본타입과 참조타입간의 형변화 안됨(예외 있음)
//        원시타입 -> 참조타입  X         참조타입  -> 원시타입 X
//         참조타입 ex)  String


    }
}
