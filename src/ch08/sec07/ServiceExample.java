package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImp();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        Service.staticMethod2();
        System.out.println();
    }
}
