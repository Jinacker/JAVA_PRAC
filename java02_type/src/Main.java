//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //type
        //1.기본타입 8개 : byte,short,char,int,long,float,double,boolean
        //wrapper class : 기본타입을 객체로 사용할수 있도록 만든 클래스
        //byte : 1byte 정수
        System.out.println(Byte.MIN_VALUE +"~"+Byte.MAX_VALUE);
        byte bt = 127;
        System.out.println(bt);
        bt++;
        System.out.println(bt);//-128
        byte bt2 = 10;
        byte bt3 = 20;
        //int sum = bt2 + bt3;// byte끼리의 산술연산은 int가된다.
        byte sum = (byte)(bt2+bt3);//캐스팅을 해주거나

        //short - 2byte
        System.out.println(Short.MIN_VALUE +"~"+Short.MAX_VALUE);
        short st = 32767;
        System.out.println(st);
        st++;
        System.out.println(st);
        
        //char - 2byte , 한글자문자, 정수는 0~양수
        System.out.println(Character.MIN_VALUE +"~"+Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE +"~"+(int)Character.MAX_VALUE);
        char a = 65;//a='A'
        System.out.println(a);
        a = 97;//a='a'
        System.out.println(a);

        int x = 97;
        System.out.println(x);//97
        System.out.println((char)x);//a : 캐스팅-형변환

        //int - 4byte
        System.out.println(Integer.MIN_VALUE +"~"+Integer.MAX_VALUE);
        int i = 2147483647;
        System.out.println(i);
        i++;
        System.out.println(i);

        //long - 8byte : L로 표기한다.
        System.out.println(Long.MIN_VALUE +"~"+Long.MAX_VALUE);
        long l = 21474836470L;

        //float - 4byte실수, f로 표기
        System.out.println(Float.MIN_VALUE +"~"+Float.MAX_VALUE);
        float f = 3.14f;

        //double - 8byte실수
        System.out.println(Double.MIN_VALUE +"~"+Double.MAX_VALUE);
        double d = 3.14;

        //boolean - 1byte 참거짓
        System.out.println(Boolean.TRUE+","+Boolean.FALSE);
        boolean bool = false;
        System.out.println(bool);
        System.out.println(!bool);

        //2.참조타입(무한대) : String,Array,Object
        String name = "kim";
        String name2 = new String("kim");

        //js배열 : let arr = ["kim","lee"];
        String[] names = new String[]{"kim","lee"};
        int[] sus = new int[]{11,22,33};

        //각 타입별 기본값
        //정수타입 : 0
        //실수타입 : 0.0
        //블린타입 : false
        //참조타입 : null

        //문자로된 정수와 실수의 변환함수
        System.out.println("99"+"100");
        System.out.println(Integer.parseInt("99")+Integer.parseInt("100")); // 이거 코테에 나옴 !!!!! 잘 알아둘것.
        System.out.println("99.99"+"100.123");
        System.out.println(Double.parseDouble("99.99")+Double.parseDouble("100.123")); // 이거 코테에 나옴!!!!!

        //아스키코드 정리해서 몇개는 암기
        System.out.println((int)'0');//48
        System.out.println((int)'A');//65
        System.out.println((int)'a');//97

        for (int m = 48; m < 200; m++) {
            System.out.println((char)m+":"+m);
        }

    }//end main
}//end class