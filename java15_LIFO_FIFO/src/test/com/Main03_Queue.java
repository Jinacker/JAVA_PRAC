package test.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main03_Queue {
    public static void main(String[] args) {
        System.out.println("hello");

        //2.Queue - FIFO
        Queue<Integer> q = new LinkedList<>();
        q.offer(5001);
        q.offer(5002);
        q.offer(5003);
        q.offer(5004);
        System.out.println(q);
        System.out.println(q.isEmpty());//비었니?
        System.out.println(q.peek());//FO대상이 뭐니?
        System.out.println(q.contains(5003));//검색:boolean
        System.out.println(q.poll());//FO 추출
        System.out.println(q.poll());//FO 추출
        System.out.println(q);

        for (Integer x : q){
            System.out.println(x);
        }

        //모든데이터들을 큐가 비어질때까지 poll처리
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q);
        
        //미션
        //문자열을 큐에 넣어서 위와 같이 출력해보세요

    }//end main
}//end class
