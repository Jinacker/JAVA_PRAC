package test.com;

import aaa.bbb.Person;

public class Main01 {
    final String name = "java";//선언시 final 전역변수는 반드시 초기화
    public static final String USER_ID = "admin";//static final인경우 변수명을 대문자로...권장,구분자는 언더바사용

    public static void main(String[] args) {
        System.out.println("hello");

        //final : 변수(로컬,전역), 메소드, 클래스
        final int x = 10;
        //x = 20; //변경불가
        System.out.println(x);

        Main01 m1 = new Main01();
        System.out.println(m1.name);

        System.out.println(Main01.USER_ID);
        System.out.println(Integer.MAX_VALUE);

        Person p = new Man();
        p.sleep();

    }//end main

}//end class
