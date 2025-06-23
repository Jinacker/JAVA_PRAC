package test.com;

public class Main05 {

    public static void main(String[] args) {
        System.out.println("hello");

        //Multi array- 다차원배열
        //데이터 직접할당(동적할당)
        //문자열 이차원배열을 만들고 출력하세요(데이터는 임의의값)
        String[][] strss = new String[][]{
                {"aaa","bbb","ccc"},
                {"ddd","eee","fff","ggg"}};
        for (int x = 0; x < strss.length; x++) {
            for (int i = 0; i < strss[x].length; i++) {
                System.out.print(strss[x][i]+" ");
            }
            System.out.println();
        }

        for(String[] strs:strss){
            for(String x : strs){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        String[][] strss2 = new String[2][3];
        strss2[0] = new String[]{"aaa2","bbb2","99"};
        strss2[1] = new String[]{"ddd2","eee2","fff2","ttt2"};
        strss2[0][0] = "xxx";
        //strss2[0][4] = "xxx";//error
        for(String[] strs:strss2){
            for(String x : strs){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
        //double이차원배열을 만들고 출력해보세요
        double[][] dss = new double[][]{{1.1,2.2,99},{4.4,5.5,6.6,7.7}};
        for(double[] ds:dss){
            for(double x : ds){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }//end main


}//end class
