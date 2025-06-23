package test.com;

public class ThreadEx extends Thread{

    @Override
    public void run() {
        System.out.println("ThreadEx run()....");
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadEx..."+i);
            try {
                Thread.sleep(500);// 1/1000초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
