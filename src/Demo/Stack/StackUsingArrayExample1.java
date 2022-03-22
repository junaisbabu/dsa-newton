package Demo.Stack;

public class StackUsingArrayExample1 {
    private int stack[];
    private int maxCapacity;
    private int top;

    StackUsingArrayExample1(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        stack = new int[maxCapacity];
        top = -1;
    }

    // isEmpty

    private boolean isEmpty() {
        return (top == -1);
    }

    // isFull
    private boolean isFull() {
        return (top == (maxCapacity - 1));
    }

    // push
    private void push(int element) {
        if(isFull())
            System.out.println("Stack is full");
        else
            stack[++top] = element;
    }

    // pop
    private void pop() {
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            top --;
    }

    // peek
    private void peek() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println(stack[top]);
    }

    // traverse
    private void traverse() {
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        StackUsingArrayExample1 stack = new StackUsingArrayExample1(5);

        stack.pop();

        stack.peek();

        stack.push(1);
        stack.push(2);
        stack.peek();
        stack.pop();

        stack.pop();

        stack.push(3);

        stack.peek();

        stack.push(4);
        stack.push(5);

        stack.peek();

        stack.push(6);

        stack.traverse();

    }
}
