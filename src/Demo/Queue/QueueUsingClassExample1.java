package Demo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingClassExample1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert
        queue.add(10);
        queue.add(20);

        System.out.println(queue);

        // Remove
        int remove = queue.remove();
        System.out.println("Removed Element: " + remove);

        System.out.println(queue);

        // Top view of the head
        int head = queue.peek();
        System.out.println("Head of queue: " + head);

        // Size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

    }
}
