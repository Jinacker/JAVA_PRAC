package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //Person - name,age : sleep():void


        //Man - money,eye : eat():void

        //1.Person <---- Man : extends
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();
        System.out.println("===========");

        Man m = new Man();
        System.out.println(m.money);
        System.out.println(m.eye);
        System.out.println(m.name);
        System.out.println(m.age);
        m.eat();
        m.sleep();

        System.out.println("===========");

        Person p2 = new Man();
        System.out.println(p2.name);
        System.out.println(p2.age);
        p2.sleep();


        System.out.println("===========");

        //2.Person 으로 익명내부클래스 생성하기.
        Person p3 = new Person(){
            @Override
            public void sleep() {
                System.out.println("inner sleep()...");
            }
        };
        System.out.println(p3.name);
        System.out.println(p3.age);
        p3.sleep();

        System.out.println("===========");

        //Person <---- Student
        Person p4 = new Student();
        System.out.println(p4.name);
        System.out.println(p4.age);
        p4.sleep();

        System.out.println("===========");
        //Person <---- Man <---- My
        My my = new My();
        my.test();

    }//end main
}//end class
