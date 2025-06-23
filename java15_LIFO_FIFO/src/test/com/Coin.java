package test.com;

import java.util.Objects;

public class Coin {

    private int value;

    public Coin() {
    }

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //Stack에서 contains메소드를 사용하기위해서는 속성비교를 위해
    //데이터클래스로 만들어줄 필요가 있다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return value == coin.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }
}
