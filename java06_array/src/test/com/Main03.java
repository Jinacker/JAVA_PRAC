package test.com;

public class Main03 {

    public static void main(String[] args) {
        System.out.println("hello");

        int[] arr = new int[5];//0,0,0,0,0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)*10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //String[5] 반복문사용하여 임의의 값할당,출력
        String[] names = new String[5];//null,null,,,,
        for (int i = 0; i < names.length; i++) {
            names[i] = "kim"+i;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //double[5] 반복문사용하여 임의의 값할당,출력
        double[] ds = new double[5];//0.0,0.0,,
        for (int i = 0; i < ds.length; i++) {
            ds[i] = 10.0+i;
        }
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }

        //char[5] 반복문사용하여 임의의 값할당,출력
        char[] cs = new char[5];//0,0,0,,,
        for (int i = 0; i < cs.length; i++) {
            cs[i] = (char)(48+i);
        }
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }

        //boolean[5] 반복문사용하여 임의의 값할당,출력
        boolean[] bs = new boolean[5];//false,false,,,,
        for (int i = 0; i < bs.length; i++) {
            if(i%2==0)bs[i] = true;
        }
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }


    }//end main


}//end class
