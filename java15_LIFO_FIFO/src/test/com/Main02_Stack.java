package test.com;

import java.util.Stack;

public class Main02_Stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //미션
        //Coin : 속성 : -value:int
        Stack<Coin> st = new Stack<>();
        st.push(new Coin());
        st.push(new Coin());
        st.push(new Coin(100));
        st.push(new Coin(1000));
        st.push(new Coin(10000));
        st.push(new Coin(100000));
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        //객체에대한 contains를 사용지 >> 데이터클래스 적용해줘야한다.
        System.out.println(st.contains(new Coin()));
        System.out.println(st.contains(new Coin(1000)));

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);
        st.clear();
        System.out.println(st);
        System.out.println(st.empty());

        //복사 후 줄이동 단축키 : 커서를 위치하고 ctrl + d , Alt + Shift + 화살표 상하 이동
    }//end main
}//end class
