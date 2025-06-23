package test.com;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello");

        //MVC모델 디자인 패턴 : Model,View,Controller
        //싱글톤 디자인 패턴 : 클래스에서 만들수 잇는 인스턴스가 오직 하나일 경우 이객체의 접근은
        //                  어디서든지 하나로만 통일해서 제공하도록 객체를 생성하는 기법.
        //                  즉,객체생성에 대한 static의 응용이다.

        //컨셉 : 특정시스템에서 많은 프린트기능이 있다라고 하고 프린트스풀

        PrintSpool p1 = PrintSpool.getInstance();
        System.out.println(p1);
        p1.print("hello111");
        System.out.println("===============");

        PrintSpool p2 = PrintSpool.getInstance();
        System.out.println(p2);
        p2.print("hello222");
        System.out.println("===============");


    }//end main
}//end class
