package test.com;

public class Main04_mission {
    public static void main(String[] args) {
        System.out.println("hello...");

        //Score클래스를 이용해서 성적처리하는 프로그램을 작성하세요
        //3명의 성적을 처리하고 출력하는 프로그램

        Score[] ss = new Score[3];

        for (int i = 0; i < ss.length; i++) {

            String name = "kim";
            int kor = 99;
            int eng = 88;
            int math = 77;
            int total = kor+eng+math;
            double avg = total/3.0;
            String grade = "A";
            if(avg<=100&&avg>=90){
                grade = "A";
            }else if(avg>=80){
                grade = "B";
            }else if(avg>=70){
                grade = "C";
            }else{
                grade = "D";
            }

            Score s = new Score(name,kor,eng,math,total,avg,grade);
            ss[i] = s;
        }//end for

        for(Score x : ss){
            System.out.println(x);
        }

        
    }//end main
}//end class
