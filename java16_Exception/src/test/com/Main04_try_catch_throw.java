package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main04_try_catch_throw {
    public static void main(String[] args) {
        System.out.println("hello");

        //throw + new 예외처리객체: 익셉션(예외처리)를 강제로 발생 시켜줄수있다.
        
        BufferedReader br = null;//new BufferedReader(new InputStreamReader(System.in))
        InputStreamReader isr = null;
        InputStream is = null;
        try {
            is = System.in;
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            br.readLine();
            
            throw new NumberFormatException();
           // throw new NullPointerException();
            //throw new Exception();

        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException....");
        }  catch(NullPointerException e) {
            System.out.println("NullPointerException....");
        } catch(IOException e) {
            System.out.println("IOException....");
        }  catch (Exception e) {
            System.out.println("Exception....");
        }


        System.out.println("end main....");

    }//end main


}//end class
