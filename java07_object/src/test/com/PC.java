package test.com;

public class PC {

    String model;
    int price;
    String color;

    public PC() {
    }

    public PC(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
