package test.com;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("RunnableImpl run()....");
        for (int i = 0; i < 10; i++) {
            System.out.println("RunnableImpl..."+i);
            try {
                Thread.sleep(500);// 1/1000초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
