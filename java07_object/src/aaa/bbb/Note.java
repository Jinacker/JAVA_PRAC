package aaa.bbb;

public class Note {
    public int price;
    public String color;

    public Note() {
    }

    public Note(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Note{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
