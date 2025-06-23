package test.com;

public class My extends Man{
    String email = "aaa@aaa.com";
    String tel = "010";
    String name = "lee";
    int money = 333;

    public void test(){
        System.out.println("My test()...");
        System.out.println(super.name);//Person
        System.out.println(this.name);//My
        System.out.println(money);//Man
        System.out.println(email);//My
        super.sleep();//Person 오버라이딩 Man
        this.sleep();//Man 오버라이딩 My
        super.eat();//Man
        this.eat();//My
    }

    @Override
    public void eat() {
        System.out.println("My eat()...");
    }

    @Override
    public void sleep() {
        System.out.println("My sleep()...");
    }
}
