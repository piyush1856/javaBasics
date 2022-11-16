package sprint4Day4Live;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _5Queue {

    public static void main(String[] args) {

        Queue<Integer> q= new LinkedList<>();
        //Deque<Integer> a2 = new ArrayDeque<>();
        //a2.

        q.add(2);
        q.add(3);
        //q.remove();//remove 2
        q.peek();// return 2 without removing it
        q.poll();//pop of stack : remove 2 from it
        System.out.println(!q.contains(2));
        
        System.out.println(q.isEmpty());

        if(q.size()>0){
            //peek,poll, remove ..
        }else{
          //  compiler will give exception
        }

    }
}
