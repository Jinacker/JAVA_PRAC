package test.com;

public class Student extends Person{

    int kor = 99;
    int eng = 88;
    int math = 77;

    public void study(){
        System.out.println("Student study()....");
    }

    @Override
    public void sleep() {
        System.out.println("Student sleep()...");
    }
}
