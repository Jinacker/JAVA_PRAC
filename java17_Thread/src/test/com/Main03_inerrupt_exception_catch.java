package test.com;

public class Main03_inerrupt_exception_catch {
    public static void main(String[] args) {
        System.out.println("hello");
        
        //스레드 제어 : 스레드 종료(정지)
        
        //2.인터럽트 + 슬립(0.001)
        //PrintThreadEx02 클래스를 생성하고 스레드로 동작 구현하세요
        PrintThreadEx02 pt = new PrintThreadEx02();
        pt.start();

        //스레드 스타트 시키고 1초정도 쉬었다가 정지 시키려한다.
        try {
            Thread.sleep(1000);
            //interrupt메소드로 익셉션캐치되도록 처리
            pt.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end main...");
    }//end main
}//end class
