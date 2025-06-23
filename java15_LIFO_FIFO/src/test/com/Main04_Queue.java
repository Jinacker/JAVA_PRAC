package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class Main04_Queue {
    public static void main(String[] args) {
        System.out.println("hello");

        //Message class : - command : String, - to : String
        Queue<Message> q = new LinkedList<>();
        q.offer(new Message());
        q.offer(new Message("Send Email","Hong"));
        q.offer(new Message("Send SMS","Kim"));
        q.offer(new Message("Send Katok","Lee"));
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.contains(new Message("Send Email","Hong")));
        System.out.println(q.size());
        System.out.println("=============");

        for(Message x : q){
            System.out.print(x.getCommand()+" ");
            System.out.println(x.getTo());
        }

        System.out.println("=============");
        //큐의 모든 메세지를 순차적으로 비우자~
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q);


    }//end main
}//end class
