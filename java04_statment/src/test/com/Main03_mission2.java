package test.com;

import java.util.Scanner;

public class Main03_mission2 {

    public static void main(String[] args) {
        System.out.println("hello");

        //java.util - 입력 : 스캐너 Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("이름:");
        String name =  s.nextLine();

        //변수 - 국어kor,영어eng,수학math,총점total,평균avg,등급grade 
        System.out.println("국어:");
        //int kor =  Integer.parseInt(s.nextLine());
        int kor =  s.nextInt();

        System.out.println("영어:");
        //int eng =  Integer.parseInt(s.nextLine());
        int eng =  s.nextInt();

        System.out.println("수학:");
        //int math =  Integer.parseInt(s.nextLine());
        int math =  s.nextInt();

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
