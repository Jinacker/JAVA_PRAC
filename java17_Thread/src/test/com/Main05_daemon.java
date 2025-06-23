package test.com;

public class Main05_daemon {
    public static void main(String[] args) {
        System.out.println("hello");

        //데몬스레드 : 주 스레드(메인스레드)작업을 돕는 보조적 역할을 하는 스레드
        //          - 주 스레드가 종료되면 데몬드레드는 자동 종료
        //          - 주 스레드와 동반종료되는 것을 제외하면 일반스레드구현과 차이가 없다.
        //설정방법 : 주 스레드 시작전에 반드시 데몬스레드를 실행시키는 메소드를 호출해줘야한다.

        //컨셉 : 주 스레드가 종료될때 자동저장기능도 같이 종료되는 데몬스레드 구현하기.
        AutoSaveThread ast = new AutoSaveThread();
        ast.setDaemon(true);//일반스레드에서 데몬스레드로 설정하는 메소드
        ast.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end main....");
    }//end main
}//end class
