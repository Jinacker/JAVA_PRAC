package test.com;

public class UserThreadEx01 extends  Thread{

    private Calculator cal;

    public Calculator getCal() {
        return cal;
    }

    public void setCal(Calculator cal) {
        this.cal = cal;
        this.setName("UserThreadEx01....");//Thread-0 가독성 있게 이름변경
    }

    @Override
    public void run() {
        System.out.println("UserThreadEx01 run()....");
        cal.setMoney(100);
        System.out.println("==============");
    }
}
