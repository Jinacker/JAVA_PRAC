package test.com;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello");

        //아래의 두번의 프린트 출력부를 두개의 스레드로 나누어서 처리하세요

        new Thread(){
            @Override
            public void run() {
                PrintSpool p1 = PrintSpool.getInstance();
                System.out.println(p1);
                p1.print("hello111");
                System.out.println("===============");
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                PrintSpool p2 = PrintSpool.getInstance();
                System.out.println(p2);
                p2.print("hello222");
                System.out.println("===============");
            }
        }.start();



        System.out.println("end main....");
    }//end main
}//end class
