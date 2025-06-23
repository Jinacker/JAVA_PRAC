package test.com;

public class Bus extends Car{
    int count = 20;
    int pay = 2000;

    public Bus() {
        super();//부모클래스(슈퍼클래스)의 생성자,생략가능
        System.out.println("Bus()...");
    }

    public void open(){
        System.out.println("open()....");
        System.out.println(model);
        System.out.println(price);
        start();
    }

    //@ : 어노테이션
    //오버라이드 : 상위클래스의 메소드를 재정의
    @Override
    public void start() {
        System.out.println("Bus start()...");
    }
}
