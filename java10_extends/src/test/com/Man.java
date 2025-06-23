package test.com;

public class Man extends Person{
    int money = 100;
    double eye = 1.5;

    public void eat(){
        System.out.println("Man eat()...");
    }

    @Override
    public void sleep() {
        System.out.println("Man sleep()...");
    }
}
