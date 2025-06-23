package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_do_while {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //BufferedReader 를 사용해서 프로그램이 종료되도록 수정하세요
        //Scanner를 사용해도 무방합니다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = "y";

        do{
            x = br.readLine();
            System.out.println("x:"+x);
            System.out.println("종료하려면 x입력");
        }while(!x.equals("x"));

//        boolean bool = true;
//        do{
//            x = br.readLine();
//            System.out.println("x:"+x);
//            System.out.println("종료하려면 x입력");
//            if(x.equals("x"))break;
//        }while(bool);

        //주의 : 상단에 무한반복문일 경우 하단코딩은 컴파일 오류가난다.
        //그래서 분기분을 통해서 break처리가 존재해야 while문 하단에서
        //컴파일 오류가 나지 않는다.
        System.out.println("end main...");

    }//end main
}//end class
