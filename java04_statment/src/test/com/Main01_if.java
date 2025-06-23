package test.com;

public class Main01_if {
    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println(args);
        System.out.println(args == null);

        if(args != null){
            System.out.println("args is not null...");
        }

        //int 와 Integer
        int x = 10;//기본타입
        //x값을 String으로 변환하기.
        String y = x + "";
        System.out.println(y);
        y = String.valueOf(x);
        System.out.println(y);
        //y = x.toString();//error
        //System.out.println(y);

        Integer a = 10;//참조타입
        y = a + "";
        System.out.println(y);
        y = String.valueOf(a);
        System.out.println(y);
        y = a.toString();
        System.out.println(y);

        Integer b = 20;
        if(b == 20){
            System.out.println("20입니다.");
        }
        
        double avg = 77;
        String grade = "A";
        //if~else if 를 사용해서 등급을 동적으로 구현해보세요
        if(avg<=100 && avg >=90){
            grade = "A";
        }else if(avg >=80){
            grade = "B";
        }else if(avg >=70){
            grade = "C";
        }else{
            grade = "D";
        }
        System.out.println(grade);


    }//end main
}//end class
