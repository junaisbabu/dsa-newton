package Demo.Queue;

public class QueueUsingArrayExample1 {
    int front;
    int rear;
    int capacity;
    int queue[];

    QueueUsingArrayExample1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    private boolean isEmpty() {
        return(rear == -1 || front > rear);
    }

    private boolean isFull() {
        return (rear == (capacity - 1));
    }

    private void enqueue(int data) {
        if (isFull())
            System.out.println("Queue is full");
        else {
            if(isEmpty()) {
                front = 0;
            }
                rear ++;
                queue[rear] = data;

        }
    }

    private void dequeue() {
        if(isEmpty())
            System.out.println("Queue is empty");
        else {
            front ++;
        }
    }

    private void traverse() {
        if(isEmpty())
            System.out.println("Queue is empty");
        else {
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    QueueUsingArrayExample1 queue = new QueueUsingArrayExample1(5);

            queue.dequeue();

            queue.enqueue(7);
            queue.enqueue(9);
            queue.enqueue(3);

            queue.traverse();

            queue.dequeue();

            queue.traverse();

            queue.enqueue(38);

            queue.traverse();
    }
}
