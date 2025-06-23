package test.com;

public interface TestInter03 extends TestInter01,TestInter02{
    /*public static final */String USER_NAME = "java";
    public default void start(){
        System.out.println("TestInter03 default start()....");
    }

    public static void stop(){
        System.out.println("TestInter03 static stop()....");
    }

    public /*abstract*/ void sleep();

}
