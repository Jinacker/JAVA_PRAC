package test.com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_mission2 {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //회원가입프로그램을 작성할것
        //3명회원정보는 배열에 할당해서 처리할것.
        //id,pw,name,tel
        //예:new String[]{"admin","hi111","kim","010"}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] members = new String[3][];

        for (int i = 0; i < members.length; i++) {
            System.out.println("id:");
            //String id = "admin";
            String id = br.readLine();

            System.out.println("pw:");
            //String pw = "hi1111";
            String pw = br.readLine();

            System.out.println("name:");
            //String name = "kim";
            String name = br.readLine();

            System.out.println("tel:");
            //String tel = "010";
            String tel = br.readLine();

            members[i] = new String[]{id,pw,name,tel};
        }


        for(String[] member:members){
            for(String x: member){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }//end main


}//end class
