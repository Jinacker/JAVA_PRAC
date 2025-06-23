package test.com;

import java.util.*;

public class Main05_Deque {
    public static void main(String[] args) {
        System.out.println("hello");

        //Deque(덱,데크) - Stack + Queue
        //혼합형 : 스텍의 장점과 큐의 장점을 둘다 사용가능
        //데이터의 추출을 앞뒤로 할 수 있다.
        //기본은 FIFO

        Deque<String> dq = new ArrayDeque<>();
        dq.offer("hello1");
        dq.offer("hello2");
        dq.offer("hello3");
        dq.offer("hello4");
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.peek());//기본은 FIFO
        System.out.println(dq.contains("hello2"));
        System.out.println(dq.isEmpty());

        dq.offerFirst("데크111");
        dq.offerFirst("데크222");
        System.out.println(dq);
        dq.offerLast("데크333");
        dq.offerLast("데크444");
        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);

        
        //Integer 데크에 할당해 보세요
        Deque<Integer> dq_int = new ArrayDeque<>();
        dq_int.offer(100);
        dq_int.offer(1000);
        dq_int.offerFirst(10000);
        dq_int.offerLast(100000);
        System.out.println(dq_int);
        while(!dq_int.isEmpty()){
            //System.out.println(dq_int.pollLast());
            System.out.println(dq_int.pollFirst());
        }
        System.out.println(dq_int);
        
        //int[]도 데크에 할당해 보세요
        Deque<int[]> dq_arr = new ArrayDeque<>();
        dq_arr.offer(new int[]{11,22,33});
        dq_arr.offerFirst(new int[]{111,222,333});
        System.out.println(dq_arr);
        for (int[] x : dq_arr){
            System.out.println(Arrays.toString(x));
        }
        System.out.println("=================");

        //데크에서 모든 요소를 뒤로부터 제거하면서 각 배열의 합을 출력하세요
        while(!dq_arr.isEmpty()){
            int[] arr = dq_arr.pollLast();
            System.out.println(Arrays.toString(arr));
            int sum = 0;
            for(int x : arr){
                sum += x;
            }
            System.out.println("sum:"+sum);
        }
        System.out.println("=================");

    }//end main
}//end class
