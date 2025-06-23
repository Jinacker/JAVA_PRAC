package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01_BufferedReader {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //java.io(입출력) - 콘솔입력처리(System.in)
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("이름:");
        String name =  br.readLine();

    }//end main
}//end class
