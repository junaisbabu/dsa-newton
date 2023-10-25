package Queue.Assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {
    static Queue<Integer> ReverseK(Queue<Integer> queue, int k) {
        //enter your code here
        Queue<Integer> queue2 = new LinkedList<Integer>();

        int size = queue.size();

        int index = 0;
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            index ++;
            if(index <= k) {
                stack.add(queue.peek());
                queue.remove();
            }
            else {
                queue2.add(queue.peek());
                queue.remove();
            }

        }

        int count = 0;
        while (count <= size) {
            count ++;
            if(count <= k) {
                queue.add(stack.peek());
                stack.pop();

            }
            else {
                if(!queue2.isEmpty()) {
                    queue.add(queue2.peek());
                    queue2.remove();
                }
            }

        }

        return queue;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<Integer>();

        //add
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(ReverseK(queue, k));

    }
}
