package test.com;

import java.util.Scanner;

public class Main02_Scanner {
    public static void main(String[] args) {
        //java.util - 입력 : 스캐너 Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("이름:");
        String name =  s.nextLine();
    }//end main
}//end class
