package test.com;

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello...");

        //자바프로그램을 작성하다보면
        //정보위주의 객체, 기능위주의 객체

        //메소드(함수)를 정의하는 방법.
        Test t = new Test();
        //1.argument X, return X
        t.start();
        System.out.println("==================");


        //2.argument O, return X
        t.start(99);
        t.stop(new int[]{11,22,33});
        t.sleep(new Person());
        t.sleep(new Person("kim",33));
        t.sleep(new Person[3]);
        t.sleep(new Person[]{new Person(),new Person("lee",22)});
        t.sum(99,88,77);
        t.sum2(99,88,77,88,99);
        System.out.println(t);
        t.setNum(111);
        System.out.println(t);
        System.out.println("==================");

        //3.argument x, return O
        int result = t.eat();//99
        System.out.println(result);

        String result2 = t.eat2();//kim
        System.out.println(result2);

        int[] result3 = t.eat3();//[11,22,33]
        System.out.println(Arrays.toString(result3));

        Person result4 = t.eat4();
        System.out.println(result4);

        Person[] result5 = t.eat5();
        System.out.println(Arrays.deepToString(result5));

        int num = t.getNum();//은닉된 속성의 값을 getter함수로 반환받을 수 있다.
        System.out.println(num);
        System.out.println("===================");

        //4.argument O, return O
        int result6 = t.study(77);
        System.out.println(result6);

        //정수 여러개를 줄테니 합계내서 반환해줘~~~>>코딩으로 옮기면
        int sum3 = t.sum3(1,2,3,4,5);
        System.out.println(sum3);

        //문자열을 줄테니 구분자(:)로 잘라서 배열로 반환해줘~~~
        String[] strs = t.split("java:html:css:javascript");
        System.out.println(Arrays.toString(strs));
        System.out.println("===================");


        //Test2에 한번씩 연습하고 출력해보세요...


    }//end main
}//end class
