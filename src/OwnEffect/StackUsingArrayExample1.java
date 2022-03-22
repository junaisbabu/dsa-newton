package OwnEffect;

public class StackUsingArrayExample1 {

    private int stack[];
    private int maxCapacity;
    private int top;

    StackUsingArrayExample1(int maxCapacity) {
        this.maxCapacity = maxCapacity;

        stack = new int[maxCapacity];
        top = -1;
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    private boolean isFull() {
        return (top == maxCapacity - 1);
    }

    private void push(int element) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            stack[++top] = element;
        }
    }

    private void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack poped is : " + stack[top]);
            top --;
        }
    }

    private void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Element at top : " + stack[top]);
        }
    }

    private void traverse() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Current Stack : ");
            for(int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingArrayExample1 s = new StackUsingArrayExample1(5);

        s.traverse();

        s.push(10);
        s.push(20);
        s.push(30);;
        s.traverse();
        s.pop();
        s.traverse();

        s.peek();

        s.push(40);
        s.push(50);

        s.pop();
        s.traverse();
    }
}
