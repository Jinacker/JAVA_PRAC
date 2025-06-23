package test.com;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //열거형 상수 : enum
        //특정된 대명사들을 상수로 열거해서 객체화 할 수 있다. >> Enum 객체
        //예 : 요일,월,계절,차모델,,,,

        //1.인터페이스를 이용한 상수 선언도 가능하다.
        System.out.println(Week01_interface.FRIDAY);
        String today = Week01_interface.FRIDAY;
        System.out.println("String today : "+ today);
        System.out.println("===============");

        //2.Enum을 이용한 상수 선언
        System.out.println(Week02_enum.MONDAY);
        Week02_enum today2 = Week02_enum.MONDAY;
        System.out.println("Week02_enum today2 : " + today2);
        String today3 = today2.name();
        System.out.println("String today3 : "+ today3);

        //열거형 상수라는 것은 열거한 순서을 알 수 있다.(0~N번까지 획득가능)
        System.out.println("today2.ordinal() : "+today2.ordinal());


        //Week02_enum[]을 반환하는 메소드
        System.out.println(Week02_enum.values());

        //배열형식으로 정보를 보고자 한다면
        System.out.println(Arrays.toString(Week02_enum.values()));


    }//end main

}//end class
