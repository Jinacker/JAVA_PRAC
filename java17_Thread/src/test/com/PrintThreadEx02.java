package test.com;

public class PrintThreadEx02 extends Thread{

    @Override
    public void run() {
        boolean bool = true;
        try {
            while(bool){
                System.out.println("run().....");

                Thread.sleep(1);// 0.001초

            }//end while
        } catch (InterruptedException e) {
            System.out.println("InterruptedException....");
            //throw new RuntimeException(e);
        }
        System.out.println("stop run()...");
    }
}
