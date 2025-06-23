package test.com.set;

import java.util.Objects;

public class PersonVO {
    private int num;
    private String name;
    private int age;

    public PersonVO() {
    }

    public PersonVO(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonVO personVO = (PersonVO) o;
        return num == personVO.num && age == personVO.age && Objects.equals(name, personVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, age);
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
