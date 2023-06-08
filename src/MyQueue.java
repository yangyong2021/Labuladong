import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack = new Stack<>();

    Stack<Integer> stack2 = new Stack<>();


    public MyQueue() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        peek();
        return stack2.pop();
    }

    public int peek() {

        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }

        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
    }
}
