package test.com;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello");

        //kim,lee,han 문자열 배열로 만들고 반복문으로 출력해보세요
        String[] names = new String[]{"kim","lee","han"};
        System.out.println("names.length:"+names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for(String x : names){
            System.out.println(x);
        }

        //1.1,2.2,3.3 실수들을 배열로 만들고 반복문으로 출력
        double[] ds = new double[]{1.1,2.2,3.3};
        System.out.println("ds.length:"+ds.length);
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }
        for(double x : ds){
            System.out.println(x);
        }

        //'a','b','c' 배열
        char[] cs = new char[]{'a','b','c'};
        System.out.println("cs.length:"+cs.length);
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }
        for(char x : cs){
            System.out.println(x);
        }

        //true,false,true
        boolean[] bs = new boolean[]{true,false,true};
        System.out.println("bs.length:"+bs.length);
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
        for(boolean x : bs){
            System.out.println(x);
        }
    }//end main


}//end class
