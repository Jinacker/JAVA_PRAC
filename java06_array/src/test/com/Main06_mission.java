package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_mission {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //앞서 구현했던 소스들중 성적처리프로그램을 활용할것.
        //3명의 학생들 성적처리시 각 학생의 정보는 배열에 할당해서 처리할것.
        //예:new String[]{"kim","99","88","77","264","88.0","B"}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] scores = new String[3][];
        for (int i = 0; i < scores.length; i++) {


            System.out.println("name:");
            //String name = "kim";
            String name = br.readLine();

            System.out.println("kor:");
            //String kor = "99";
            String kor = br.readLine();

            System.out.println("eng:");
            //String eng = "88";
            String eng = br.readLine();

            System.out.println("math:");
            //String math = "77";
            String math = br.readLine();

            String total = ""+(Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math));
            String avg = ""+Integer.parseInt(total)/3.0;
            String grade = "A";
            double d_avg = Double.parseDouble(avg);
            if(d_avg<=100 && d_avg>=90){
                grade = "A";
            }else if(d_avg>=80){
                grade = "B";
            }else if(d_avg>=70){
                grade = "C";
            }else{
                grade = "D";
            }
            String[] score = new String[]{name,kor,eng,math,total,avg,grade};

            scores[i] = score;
        }//end for

        for(String[] score:scores){
            for(String x: score){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }//end main


}//end class
