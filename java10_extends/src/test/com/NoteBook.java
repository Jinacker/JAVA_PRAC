package test.com;

public abstract class NoteBook {

    //추상메소드 : 상속관계에서 자식의 클래스에게 오버라이딩을 강제하는 메소드
    public abstract int insert(int x,int y);


    //일반메소드는 오버라이딩 강제하지 않는다.
    public void on(){}

    public abstract String update(String name);

}
