package test.com;

public class PrintThreadEx01 extends Thread{

    private boolean stop;//false

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop){
            System.out.println("run().....");

        }
        System.out.println("stop run()...");
    }
}
