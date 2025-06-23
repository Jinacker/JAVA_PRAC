package test.com;

public class NoteBookEx extends NoteBook{

    //추상클래스를 상속받으면 오버라이딩이 강제된다.
    @Override
    public int insert(int x, int y) {
        System.out.println("NoteBookEx....insert()...");
        return 0;
    }

    @Override
    public String update(String name) {
        System.out.println("NoteBookEx....update()...");
        return "kim";
    }
}
