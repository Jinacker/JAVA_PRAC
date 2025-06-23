package test.com;

public class Person /*extends Object*/{

    String name = "kim";//null
    int age = 33;//0

    //Person(){}//매개변수가 없는 생성자는 생략가능
    //생성자의 역할은 속성초기화.
    
    //toString()메소드 재정의 - 객체의 속성정보를 쉽게 확인가능하도록 사용가능

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
