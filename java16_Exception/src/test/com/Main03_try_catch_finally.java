package test.com;

public class Main03_try_catch_finally {
    public static void main(String[] args) /*throws IOException */ {
        System.out.println("hello");

        //finally블럭-오류 발생 유무와 상관없이 반드시 수행해야할 코드블럭
        int x = 10;
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

            System.out.println(Integer.parseInt("123"));
            System.out.println("=========");

            x = 0;
            System.out.println("try....x : "+x);

            System.out.println("=========");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException......");
            System.out.println(e);
            System.out.println("catch....x : "+x);
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
        }finally {
            x = 1;
            System.out.println("finally.....x : "+x);
        }


        System.out.println(100/x);
        System.out.println("end main....");

    }//end main


}//end class
