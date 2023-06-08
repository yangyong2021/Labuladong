public class QueueToStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.top());
        System.out.println(myStack.top_elem);
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }

}
