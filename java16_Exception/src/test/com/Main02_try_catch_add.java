package test.com;

public class Main02_try_catch_add {
    public static void main(String[] args) /*throws IOException */ {
        System.out.println("hello");

        //여러개의 오류 처리를 위한 멀티캐치문
        try {
            int[] sus = new int[5];
            System.out.println(sus[4]);
            System.out.println("=========");

            System.out.println(10 / 10);

            System.out.println("=========");

            String[] strs = new String[]{"aaa", "bbb"};
            //strs = null;
            System.out.println(strs.length);

            System.out.println("=========");

            System.out.println(Integer.parseInt("_123"));

            System.out.println("=========");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException......");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException......");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException......");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException......");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception......");
            System.out.println(e);
        }


        System.out.println("end main....");

    }//end main


}//end class
