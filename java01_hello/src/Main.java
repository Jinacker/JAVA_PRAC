//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // 클래스 => public => 다 접근 허용 / 걍 지워버리면 => 같은 패키지 안에서만 접근
    public static void main(String[] args) { // 메서드: public => 접근 권한
        // / static => 정적 / void => 리턴타입 / main => 메서드 명 / String[] args => 매개변수
        // 자바에서 메인 메서드는 무조건 이걸로 정의해야함.

        System.out.println("hello");//String type 0글자이상
        System.out.println('a');//char 반드시 한글자 문자
        System.out.println(111);//정수타입:byte,short,char,int,long
        System.out.println(3.14);//실수타입:float,double
        System.out.println(true);//블린타입:boolean

        System.out.println("hello" + "Kim");

        System.out.print("hello");
        System.out.print("hello\n");
        System.out.print("hello\n");

        System.out.printf("hello\n");

        int a = 10;
        double b = 99.99;
        String str = "kim";
        System.out.println("a:10,b:99.99,str:kim");
        System.out.println("a:"+a+",b:"+b+",str:"+str+"");
        System.out.printf("a:%d,b:%f,str:%s\n",a,b,str);
        System.out.printf("a:%d,b:%.2f,str:%s\n",a,b,str);

        boolean bool = true;
        System.out.printf("boolean:%b\n",bool);//true
        System.out.printf("boolean:%B\n",bool);//TRUE

        System.out.printf("name:%s,age:%d\n","kim",33);
        System.out.printf("name:%5s,age:%d\n","kim",33);
        System.out.printf("name:%-5s,age:%d\n","kim",33);

        System.out.printf("10진수:%d,%d,%d,%d,%d\n",10,11,12,13,14);
        System.out.printf("16진수:%x,%x,%x,%x,%x\n",10,11,12,13,14);
        System.out.printf("8진수:%o,%o,%o,%o,%o\n",10,11,12,13,14);
        //java에서 printf로 이진수처리불가
        //이진수변환 함수를 사용하면된다.
        System.out.println(Integer.toBinaryString(10));//1010
        System.out.println(Integer.toHexString(10));//a
        System.out.println(Integer.toOctalString(10));//12

        return; // call 한곳으로 돌아감
    }//end main


}//end class
