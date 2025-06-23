package test.com;

public class TestStatic {

    //속성에 static예약어 부여 : 객체생성없이 클래스 이름으로 바로 접근가능.
    static int num;
    static String name = "kim";

    //함수에 static부여 : 객체생성없이 클래스 이름으로 바로 접근가능.
    public static void start(){
        System.out.println("static start()...");
        //start2();//에러-바로 호출불가능 :
        //스테틱메소드가 같은 클래스 내부의 일반메소드를 호출시 객체생성 필수
        TestStatic ts = new TestStatic();
        ts.start2();
        new TestStatic().start2();
    }

    public static void start4(){
        /*TestStatic.*/start();//static메소드가 같은 클래스 내부의 static메소드 호출시 객체생성 필요없음.
        //클래스 이름도 생략가능
    }

    public void start2(){
        System.out.println("start2()...");
    }

    public void start3(){
        System.out.println("start3()...");
        start2();//일반메소드가 같은 클래스 내부의 일반메소드 호출시 객체생성 필요없음.
        start(); //일반메소드가 같은 클래스 내부의 static메소드 호출시 객체생성 필요없음.
    }

    //내부클래스(중첩클래스)에 static 부여가능
    static class Car{
        static String id = "admin";
        static void stop(){
            System.out.println("stop()...");
        }
    }

}
