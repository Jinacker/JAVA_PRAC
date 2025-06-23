package test.com.set;

import java.util.Objects;

public class Car {
    String model = "OOOO";

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    //데이터 클래스로 만들어주는 메소드들의 오버라이딩 : equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
