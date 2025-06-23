package test.com;

public class MyException extends Exception{

    int age;
    String message;

    public MyException() {
        System.out.println("MyException()....");
    }

    public MyException(int age) {
        System.out.println("MyException(int age)...."+age);
        this.age = age;
    }

    public MyException(String message, int age) {
        super(message);
        System.out.println("MyException(String message, int age)...."+message+":"+age);
        this.message = message;
        this.age = age;
    }

    public MyException(String message) {
        super(message);
        this.message = message;
        System.out.println("MyException(String message)...."+message);
    }

    @Override
    public String toString() {
        return "MyException{" +
                "age=" + age +
                ", message='" + message + '\'' +
                '}';
    }
}
