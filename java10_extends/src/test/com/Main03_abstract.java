package test.com;

public class Main03_abstract {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상클래스(abstract class) - 추상메소드(abstract method)를 포함할 수 있는 클래스
        //추상메소드 - 메소드의 구현부(코드블럭)가 없다.세미콜론으로 마감.

        //추상클래스 객체생성시 단순생성자로 객체생성불가
        // 즉 >>> 익명내부클래스로 생성하거나 상속관계의 자식의클래스생성자로 객체생성해야한다
        //NoteBook nb = new NoteBook();//에러
        NoteBook nb = new NoteBook(){
            @Override
            public int insert(int x, int y) {
                System.out.println("inner insert()...");
                return 0;
            }

            @Override
            public String update(String name) {
                System.out.println("inner update()...");
                return "lee";
            }
        };//익명 내부클래스
        nb.insert(11,22);
        nb.update("aaa");


        NoteBook nb2 = new NoteBookEx();//상속받은클래스
        nb2.insert(33,44);
        nb2.update("bbb");

    }//end main
}//end class
