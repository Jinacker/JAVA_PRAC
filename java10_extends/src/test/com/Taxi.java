package test.com;

public class Taxi extends Car{

    String part = "kakao";
    int pay = 4000;

    public void stop(){
        System.out.println("Taxi stop()....");
    }

    @Override
    public void start() {
        System.out.println("Taxi start()....");
    }
}
