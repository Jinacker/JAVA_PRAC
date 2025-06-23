package test.com;

public class Main01 {

    static Person_interface pi = new Person_interface() {
        @Override
        public void sleep() {
            System.out.println("inner sleep()...4");
        }
    };

    public static void main(String[] args) {
        System.out.println("hello");

        //내부클래스 : 클래스내부에 클래스를 정의하는 방법
        //목적 : 외부클래스의 자원을 내부클래스에서 객체생성없이 사용가능.
        //1.멤버 내부클래스
        MemberOuter outer = new MemberOuter();
        outer.new Inner().test();
        System.out.println(outer.new Inner().age);
        System.out.println("===============");

        //2.스테틱 내부클래스
        StaticOuter.StaticInner.test();
        new StaticOuter.StaticInner().test2();//Non static
        System.out.println(StaticOuter.StaticInner.age);
        System.out.println("===============");

        //3.익명 내부클래스
        System.out.println("===============");
        //여러분이 구현해보세요 3가지방법(일반클래스,추상클래스,인터페이스)
        Person p = new Person(){
            @Override
            public void sleep() {
                System.out.println("inner sleep()...1");
            }
        };
        p.sleep();

        Person_abstract pa = new Person_abstract(){
            @Override
            public void sleep() {
                System.out.println("inner sleep()...2");
            }
        };
        pa.sleep();

        /*final*/ int result = 99;
        Person_interface pi = new Person_interface() {
            @Override
            public void sleep() {
                System.out.println("inner sleep()...3");
                System.out.println(result);
            }
        };
        pi.sleep();

        Main01.pi.sleep();

        //4.로컬 내부클래스 - 클래스 선언 이후에만 객체생성가능
        //내부클래스안에서는 외부 로컬변수를 바로 참조(변경불가)할수 있다.
        System.out.println("===============");
        /*final*/ String id = "admin";

        class LocalInner{
            String name = "lee";
            public void test(){
                System.out.println("local inner test()...");
                //id = "kim";//로컬변수 변경불가.
                System.out.println(id);//final 변수에만 접근가능
            }
        }

        LocalInner local = new LocalInner();
        System.out.println(local.name);
        local.test();
    }//end main
}//end class
