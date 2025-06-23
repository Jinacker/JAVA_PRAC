package test.com;

import aaa.bbb.Person;

public class Man extends Person {

    public Man(){
        work();
    }

    public void work(){
        System.out.println("work()....");
        System.out.println(pname);
        System.out.println(age);
        sleep();
        sleep(100);
    }

    //sleep이름의 메소드를 사용하고자 한다면 오버로딩규칙을 지키면된다.
    public int sleep(int x) {
        System.out.println("Man...sleep(int x)..."+x);
        return 0;
    }

    @Override
    public void eat() {
        System.out.println("Man...eat()...");
    }
}
