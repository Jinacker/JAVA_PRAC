package test.com;

public class PrintSpool {

    //1.전역변수(스테틱,접근최소-은닉)
    private static PrintSpool singleton = new PrintSpool();

    //2.생성자도 은닉
    private PrintSpool() {
    }

    //3.getter정의- 싱글톤 객체(PrintSpool)를 리턴해주는 메소드(static)
    public static PrintSpool getInstance(){
        return singleton;
    }

    //4.객체가 구현하고자 하는 기능 정의-컨셉으로 프린트기능
    public void print(String str){
        System.out.println("PrintSpool print()....");
        System.out.println(str);
    }

}
