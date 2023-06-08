import java.util.LinkedList;
import java.util.Queue;

/**
 * 用一个队列来实现栈的四个基本方法
 */
public class MyStack {
    Queue <Integer> queue = new LinkedList<>();
    int top_elem = 0;
    public MyStack() {

    }
    public void push(int x){
        queue.offer(x);
        top_elem = x;
    }


    public int pop(){
        int size = queue.size();
        while (size > 2){
            queue.offer(queue.poll());
            size--;
        }
        queue.offer(queue.poll());
        return queue.poll();
    }

    public int top(){
        return top_elem;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
