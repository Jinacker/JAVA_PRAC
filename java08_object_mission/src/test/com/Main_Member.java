package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Member {
    public static void main(String[] args) throws IOException {
        System.out.println("Member....");

        //1.회원가입프로그램
        //번호(num),아이디(id),비번(pw),이름(name),폰번(tel)
        //회원(Member) 3명의 정보를 입력받아서 회원배열에 할당하고 출력하기.
        //생성자 오버로딩 사용할것.
        Member[] ms = new Member[3];//null,null,null
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ms.length; i++) {
            System.out.println("id:");
            String id = br.readLine();

            System.out.println("pw:");
            String pw = br.readLine();

            System.out.println("name:");
            String name = br.readLine();

            System.out.println("tel:");
            String tel = br.readLine();

            Member m = new Member(1+i,id,pw,name,tel);
            ms[i] = m;
        }//end for

        for(Member x : ms){
            System.out.println(x);
        }






    }//end main


}//end class
