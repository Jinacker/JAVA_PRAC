package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main03_try_catch_finally2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //IO객체를 사용하다보면 사용 후 닫아줘야하는 기능을 오류와 상관없이 반드시 구현해 줘야한다.
        BufferedReader br = null;//new BufferedReader(new InputStreamReader(System.in))
        InputStreamReader isr = null;
        InputStream is = null;
        try {
            is = System.in;
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String name = br.readLine();
            System.out.println("name:" + name);


        } catch (IOException e) {
            System.out.println("IOException....");
        } catch (Exception e) {
            System.out.println("Exception....");
        } finally {
            System.out.println("finally....close()...");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (isr != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (is != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }

        }


        System.out.println("end main....");

    }//end main


}//end class
