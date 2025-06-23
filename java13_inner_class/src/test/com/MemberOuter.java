package test.com;

public class MemberOuter {

    String name = "kim";

    public class Inner{
        int age = 33;
        public Inner(){
            System.out.println("Inner()...");
            System.out.println(name);
        }
        public void test(){
            System.out.println("test()....");
        }
    }//end Inner class

}//end outer class
