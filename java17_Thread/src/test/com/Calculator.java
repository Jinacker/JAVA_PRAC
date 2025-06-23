package test.com;

public class Calculator {
    private int money;

    public int getMoney() {
        return money;
    }

    public synchronized void setMoney(int money) {
        this.money = money;

        //스레드 슬립이 없을때 각 변경된 값으로 출력되지만
        //슬립 주석을 제거하면 50으로 고정된다.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //이를 보완하기위해서 setMoney메소드를 동기화 메소드로 만들어주면 해결된다.
        
        //현재 동작중이 스레드 이름획득
        System.out.println(Thread.currentThread().getName());
        System.out.println("this.money : "+this.money);
    }
}
