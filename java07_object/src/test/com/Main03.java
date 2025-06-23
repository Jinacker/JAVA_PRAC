package test.com;

import aaa.bbb.Note;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello...");

        //접근제한자 - public,default(package),protected(상속관계),private
        Note n = new Note();
        System.out.println(n);
        System.out.println(n.price);
        System.out.println(n.color);

        n = new Note(111,"red");
        System.out.println(n);
        System.out.println(n.price);
        System.out.println(n.color);

        Book b = new Book();
        System.out.println(b.price);
        //System.out.println(b.color);//private error
    }//end main
}//end class
