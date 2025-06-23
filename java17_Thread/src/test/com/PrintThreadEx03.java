package test.com;

public class PrintThreadEx03 extends Thread{

    @Override
    public void run() {
        boolean bool = true;

        while(bool){
            System.out.println("run()....."+Thread.interrupted());
            //메인메소드에서 interrupt()메소드 호출시
            //인터럽트 감지 메소드인 Thread.interrupted() false에서 true로 바뀌어서 리턴된다.
            if(Thread.interrupted())break;

        }//end while

        System.out.println("stop run()...");
    }
}
