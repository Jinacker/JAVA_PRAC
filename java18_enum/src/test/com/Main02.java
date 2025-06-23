package test.com;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //toString()오버라이딩 하면 객체정보를 얻어온다.
        //그래서 상수값을 얻고자 한다면 name()메소드를 호출하면 된다.
        System.out.println(Season_enum.WINTER);
        System.out.println(Season_enum.WINTER.name());

        //상수 인덱스 얻기
        System.out.println(Season_enum.WINTER.ordinal());

        //Season_enum[]
        System.out.println(Season_enum.values());

        System.out.println(Arrays.toString(Season_enum.values()));

        //setter로 변경 후 getter로 획득하기
        Season_enum.WINTER.setSeason("너무추워요");
        System.out.println(Season_enum.WINTER.getSeason());

    }//end main

}//end class
