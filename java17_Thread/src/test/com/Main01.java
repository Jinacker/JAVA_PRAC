package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
        //직렬처리 - 순차적프로그래밍
        //자바의 병렬처리 >>> Thread(class),Runnable(interface) : 상속으로 구현
        //스레드 내부 순서 : start() >> 실행대기(runnable) >> run()동작(구현할 로직코딩부)
        //              >>sleep >> 일시정지 >> 인터럽트(interrupt)
        //              >>실행대기(runnable) >> run >> 반복....
        //stop : 스레드의 즉시종료 - 불안전 종료를 유발하므로 사용하지않는것 권장.
        //인터럽트 종료 : 일시정지 상태의 스레드에서 InterruptedException을 발생시켜서
        //          catch블럭문에서 실행대기상태로 가거나 스레드 종료상태로 갈 수 있도록 해준다.


        //스레드 구현방법 - Thread상속받는 방법(ThreadEx클래스,익명내부클래스,RunnableImpl)
        //1.ThreadEx 클래스를 만드시고 run()를 오버라이딩 하세요 >> 객체생성 후 start()호출
        ThreadEx tex = new ThreadEx();
        tex.start();
        System.out.println("tex.start()................");

        //2.익명내부클래스로 객체를 생성하고 오버라이딩 및 start()호출하기.
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("inner run()....");
                for (int i = 0; i < 10; i++) {
                    System.out.println("inner..."+i);
                    try {
                        Thread.sleep(500);// 1/1000초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        System.out.println("t.start()................");

        new Thread(){
            @Override
            public void run() {
                System.out.println("inner run()....");
                for (int i = 0; i < 10; i++) {
                    System.out.println("inner2..."+i);
                    try {
                        Thread.sleep(500);// 1/1000초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();


        //3.Runnable(인터페이스를 상속받는 클래스,익명내부클래스)
        //3-1.RunnableImpl 클래스 만들고 run()오버라이딩, 객체생성.
        RunnableImpl r = new RunnableImpl();
        new Thread(r).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main..."+i);
            try {
                Thread.sleep(500);// 1/1000초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //3-2.Runnable 이용한 익명내부클래스로 구현하기.
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable inner run()....");
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Runnable inner..."+i);
//                    try {
//                        Thread.sleep(500);// 1/1000초
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable inner run()....");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable inner..."+i);
                    try {
                        Thread.sleep(500);// 1/1000초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        System.out.println("end main....");
    }//end main
}//end class
