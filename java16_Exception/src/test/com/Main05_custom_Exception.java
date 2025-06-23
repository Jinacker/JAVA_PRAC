package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main05_custom_Exception {
    public static void main(String[] args) {
        System.out.println("hello");

        //예외처리 객체를 상속받아서 커스터마이징(마이이그레이션) 가능
        try {
//            throw new MyException();
            throw new MyException("Hello Exception...");
//            throw new MyException(33);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("end main....");
        }




    }//end main


}//end class
