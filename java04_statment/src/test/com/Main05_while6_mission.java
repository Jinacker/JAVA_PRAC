package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while6_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //Main04_for3_mission.java 를 while문으로 변경해서 처리하기.
        //아래코드를 참고해서 작성할것.
        //종료값[x]이 올때까지 학생입력가능하도록 합니다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = "y";
        String result = "";//문자열을 모아서 출력할 변수
        while(true){

            System.out.println("이름:");
            String name =  br.readLine();

            //변수 - 국어kor,영어eng,수학math,총점total,평균avg,등급grade
            System.out.println("국어:");
            //String kor =  br.readLine();
            int kor =  Integer.parseInt(br.readLine());

            System.out.println("영어:");
            //String eng =  br.readLine();
            int eng =  Integer.parseInt(br.readLine());

            System.out.println("수학:");
            //String math =  br.readLine();
            int math =  Integer.parseInt(br.readLine());

            //int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
            int total = kor+eng+math;

            double avg = total/3.0;


            String grade = "A";

            if(avg<=100 && avg >=90){
                grade = "A";
            }else if(avg >=80){
                grade = "B";
            }else if(avg >=70){
                grade = "C";
            }else{
                grade = "D";
            }

            System.out.print("이름:"+name);
            System.out.print(" 국어:"+kor);
            System.out.print(" 영어:"+eng);
            System.out.print(" 수학:"+math);
            System.out.print(" 총점:"+total);
            System.out.print(" 평균:"+avg);
            System.out.println("등급:"+grade);

            //result += "이름:"+name+" 국어:"+kor+" 영어:"+eng+" 수학:"+math
            //            +" 총점:"+total+" 평균:"+avg+"등급:"+grade+"\n";
            result += String.format("이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f 등급:%s\n",
                    name,kor,eng,math,total,avg,grade);

            System.out.println("종료하려면 x입력[계속하려면 엔터 or 아무키]");
            x = br.readLine();
            System.out.println("x:"+x);

            if(x.equals("x"))break;
        }//end while

        System.out.println("=============");
        System.out.println(result);

        System.out.println("end main...");
    }//end main
}//end class
