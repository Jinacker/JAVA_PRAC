package test.com;

import java.util.Stack;

public class Main01_Stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //LIFO - Last In First Out >> Stack
        //FIFO = First In First Out >> Queue

        //1.Stack<제네릭>
        Stack<Integer> st = new Stack<>();
        st.push(5001);
        st.push(5002);
        st.push(5003);
        st.push(5004);
        System.out.println(st);
        for (Integer x : st){
            System.out.println(x);
        }
        System.out.println("==============");
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.peek());//가장 마지막에 있는 데이터 검색
        System.out.println(st);
        System.out.println(st.contains(5001));//해당데이터 존재유무 확인:boolean
        System.out.println("st.size()):"+st.size());
        System.out.println(st.empty());//스텍이 비었니?
        st.clear();//모두비우기
        System.out.println(st);
        System.out.println(st.empty());//스텍이 비었니?

        System.out.println("==============");

        //미션
        //문자열을 스텍에 넣어서 위와같이 메소드들을 구현하고 출력하기.
        //kim1,kim2,kim3,,,
        Stack<String> st2 = new Stack<>();
        st2.push("kim1");
        st2.push("kim2");
        st2.push("kim3");
        System.out.println(st2);
        System.out.println(st2.size());
        System.out.println(st2.empty());
        System.out.println(st2.peek());
        System.out.println(st2.contains("kim1"));
        System.out.println(st2.pop());
        System.out.println(st2.pop());
        System.out.println(st2);
        st2.push("kim1");
        st2.push("kim2");
        st2.push("kim3");
        System.out.println(st2);
        for (String x : st2){
            System.out.println(x);
        }
    }//end main
}//end class
