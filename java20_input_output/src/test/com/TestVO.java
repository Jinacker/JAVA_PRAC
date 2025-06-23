package test.com;

import java.io.Serializable;

//ObjectOutputStream에서 사용하기위해서는 반드시 직렬화처리 필요
public class TestVO implements Serializable {
    private int num;
    private String name;
    private int age;

    public TestVO() {
    }

    public TestVO(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
