package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Board {
    public static void main(String[] args) throws IOException {
        System.out.println("Member....");

        //2.Main_Board 생성하기
        //게시글Board 프로그램 작성하기
        //번호(num),제목(title),내용(content),작성자(writer),작성일자(wdate)
        //게시글3개를 작성하는 프로그램 처리
        //게시글 배열에 할당하고 출력하기.
        Board[] bs = new Board[3];//null,null,null
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bs.length; i++) {
            System.out.println("title:");
            String title = br.readLine();

            System.out.println("content:");
            String content = br.readLine();

            System.out.println("writer:");
            String writer = br.readLine();

            System.out.println("wdate:");
            String wdate = br.readLine();

            Board b = new Board(1+i,title,content,writer,wdate);
            bs[i] = b;
        }//end for

        for(Board x : bs){
            System.out.println(x);
        }

        //로컬변수 사용규칙(전역변수는 초기화안하면 기본값이 할당되지만 주의할것)
        int x = 10;//로컬변수는 선언시 초기화 하거나
        int y;
        y = 20;//출력전에 초기화를 해줘야한다.
        
        //로컬변수의 상수화:final 단,한번만 초기화 가능
        //선언시 초기화하거나,사용전에 한번만 초기화
        //final int z = 10;
        final int z;
        z = 100;
        //z = 200;//error 값변경불가,읽기전용(readOnly)
        
    }//end main


}//end class
