package test.com;

public class Phone {
    String model;
    double size;
    int price;

    public Phone(){
        this.model = "IOS";
        this.size = 10.2;
        this.price = 120;
    }

    //생성자의 오버로딩(인자의 개수,인자의 타입,인자의 타입순서)
    public Phone(String model, double size, int price) {
        this.model = model;
        this.size = size;
        this.price = price;
    }
    public Phone(String model, double size) {
        this.model = model;
        this.size = size;

    }

    public Phone( double size,String model) {
        this.model = model;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
