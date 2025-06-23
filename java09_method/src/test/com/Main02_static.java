package test.com;

public class Main02_static {

    public static void main(String[] args) {
        System.out.println("hello");

        //static속성 접근시 클래스 이름으로 접근가능
        System.out.println(TestStatic.num);
        System.out.println(TestStatic.name);

        TestStatic.start();

        System.out.println(TestStatic.Car.id);
        TestStatic.Car.stop();

        //Main02_static.test();//클래스이름 생략
        test();//static - static

        new Main02_static().test2(); //static - none static(instance method)

        System.out.println("===================");
        
        //TestStatic2에 한번씩 더 코딩하고 출력해보세요
        
        
        
    }//end main

    private static void test() {
        System.out.println("test()");
    }
    private void test2() {
        System.out.println("test2()");
    }


}//end class
