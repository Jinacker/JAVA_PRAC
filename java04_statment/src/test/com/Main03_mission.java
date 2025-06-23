package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //java.io(입출력) - 콘솔입력처리(System.in)
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
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

        System.out.println("이름:"+name);
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println("등급:"+grade);
        
        //최종 아래와 같이 출력되도록 코딩하세요(분기문 사용할것)
        //이름:kim
        //국어:99
        //영어:88
        //수학:77
        //총점:264
        //평균:88.0
        //등급:"A"

    }//end main
}//end class
