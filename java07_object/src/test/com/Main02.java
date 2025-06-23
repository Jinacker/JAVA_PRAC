package test.com;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //Phone객체 - model,size,price
        Phone ph = new Phone();
        System.out.println(ph);

        ph = new Phone("SM",12.0,130);
        System.out.println(ph);

        ph = new Phone("LG",20.0);
        System.out.println(ph);

        System.out.println("============");
        PC pc = new PC();
        System.out.println(pc);
        pc = new PC("ARM",90,"red");
        System.out.println(pc);

        PC[] pcs = new PC[]{pc,new PC(),new PC("AA",11,"BB")};

        System.out.println("============");
        String[] arr_pc = new String[]{"ARM","90","red"};
        System.out.println(Arrays.toString(arr_pc));

        System.out.println("============");
        String str = new String();//""
        System.out.println(str);
        str = new String("kim");//"kim"
        System.out.println(str);

        System.out.println("============");
        Random r = new Random();//시드값이 없으면 매번다른 랜덤값
        //r = new Random(10);//시드값이있으면 일정한 랜덤값생성
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(3));//0~2
            System.out.println(r.nextInt());//-21억~21억
            System.out.println(r.nextDouble());//0.0~0.9999:난수
            System.out.println(r.nextBoolean());//true,false
        }

    }//end main
}//end class
