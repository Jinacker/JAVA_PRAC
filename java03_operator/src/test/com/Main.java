package test.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        //1.산술연산자  +, -, * ,/,%
        System.out.println( 10 + 3 );
        System.out.println( 10 - 3 );
        System.out.println( 10 * 3 );
        System.out.println( 10 / 3 );//정수간 나눗셈은 정수만 반환(몫만반환)
        System.out.println( 10 / 3.0 );//실수포함 나눗셈은 실수 반환
        System.out.println( 10 % 3 );
        System.out.println("======");

        //2.증감 연산자 ++ --
        //증감전위연산이 우선순위가 높다
        int a = 10;
        int b = a++;//후위연산은 할당연산보다 우선순위가 낮다.
        System.out.println(a);
        System.out.println(b);
        System.out.println("======");

        //3.할당,대입,복합할당 =, +=,-=,*=,/=,%=,&=,|=,^=
        int x = 10;
        System.out.println( x += 10);
        System.out.println( x -= 10);
        System.out.println( x /= 10);
        System.out.println( x %= 10);

        System.out.println("======");
        //4.비트연산자 &,|,^
        System.out.println( 10 & 3 );
        System.out.println( 10 | 3 );
        System.out.println( 10 ^ 3 );

        System.out.println("======");
        //5.비교연산자 ==,!=,>,<,>=,<=
        System.out.println( 5 == 5 );
        System.out.println( 5 != 5 );
        System.out.println( 5 >= 5 );
        System.out.println( 5 <= 5 );
        System.out.println( 5 > 5 );
        System.out.println( 5 < 5 );

        //문자열 비교시에는 ==대신, equals함수를 사용합니다.
        System.out.println("kim".equals("kim"));//대소문자구분해서 비교:리턴 boolean
        System.out.println("kim".equalsIgnoreCase("KIM"));//대소문자 무시
        System.out.println("aaa".compareTo("aab"));//리턴 정수:0반환시 같은문자다
        System.out.println("aaa".compareTo("aab") == 0);//0과 비교해서 boolean획득

        System.out.println( !"kim".equals("kim") );//부정연산가능.
        System.out.println("======");


        //6.논리연산자 &,|,&&,||
        System.out.println("======");
        System.out.println(true & true);//true
        System.out.println(true && true);//true
        System.out.println(true | true);//true
        System.out.println(true || true);//true
        System.out.println("======");

        //7.쉬프트연산자(비트이동연산자) >>,<<,>>>
        System.out.println( 8 >> 1);
        System.out.println( 8 >> 2);
        System.out.println( 1 << 1);
        System.out.println( 1 << 2);
        System.out.println( 1 << 3);
        System.out.println( -1 >>> 1);
        System.out.println( -1 >>> 2);
        System.out.println( -8 >>> 1);
        System.out.println(Integer.toBinaryString(-8));
        System.out.println("0"+Integer.toBinaryString(2147483644));
        System.out.println("======");


        //8.조건연산자(삼항연산자) ? :
        double avg = 80.0;
        System.out.println(avg<=100 && avg >= 90 ? "A" : "B");
        System.out.println(avg<=100 && avg >= 90 ? "A" : avg >= 80 ? "B" : "C");
        System.out.println("======");

        //9.기타연산자 . , ... new ()







    }//end main

}//end class
