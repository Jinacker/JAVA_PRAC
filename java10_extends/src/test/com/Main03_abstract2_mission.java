package test.com;

public class Main03_abstract2_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상클래스(TestAbs) <---- TestAbsEx
        //test():void 메소드를 오버라이딩이 강제되도록 구현하세요
        //1.상속받는 클래스 활용
        TestAbs ta = new TestAbsEx();
        ta.test();
        
        //2.익명내부클래스 활용
        TestAbs ta2 = new TestAbs() {
            @Override
            public void test() {
                System.out.println("inner test()...");
            }
        };
        ta2.test();

    }//end main
}//end class
