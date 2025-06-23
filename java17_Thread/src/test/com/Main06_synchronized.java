package test.com;

public class Main06_synchronized {
    public static void main(String[] args) {
        System.out.println("hello");

        //동기화 메소드(Syschronized Mothod)
        //스레드가 사용중이 객체를 다른스레드가 변경할 수 없도록 하는 메소드
        //스레드가 끝날때까지 객체에 잠금을 걸어서 임계영역을 설정해서 다른스레드가 사용할 수 없도록 한다.
        //임계영역(크리티컬 섹션) : 멀티스레드 프로그래밍에서 단 하나의 스레드만 실행할 수 있는 코드영역
        //결론적으로 임계영역을 지정하는 메소드 >> 동기화 메소드(예약어 synchronized)

        //일반클래스(Calculator-은닉속성 money)
        //스레드클래스(UserThreadEx01,UserThreadEx02)
        Calculator cal = new Calculator();
        cal.setMoney(1111);
        System.out.println(cal.getMoney());
        System.out.println("============");

        UserThreadEx01 user01 = new UserThreadEx01();
        user01.setCal(cal);
        user01.start();

        UserThreadEx02 user02 = new UserThreadEx02();
        user02.setCal(cal);
        user02.start();

        System.out.println("end main....");
    }//end main
}//end class
