package OwnEffect;

//import LinkedList.SinglyLinkedList;

public class SingleLinkedListDeleteKthNodeFromLast {
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //traversing the list
    private void traverse() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                /*
                System.out.println("data: " + temp.data);
                System.out.println("current node address: " + temp);
                System.out.println("next node address: " + temp.next);
                System.out.println("-------------");
                 */
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private void dalete(int position) {
        Node temp = head;
            while ((position - 1) != (size - position - 1)) {
                temp = temp.next;
                System.out.println("temp : " + temp.data);
            }
    }

    //insert the new node at the end of the linked list
    private void push(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;

        size ++;
    }

    public static void main(String[] args) {
        SingleLinkedListDeleteKthNodeFromLast singlyLinkedList = new SingleLinkedListDeleteKthNodeFromLast();
        singlyLinkedList.traverse();

        singlyLinkedList.push(8);
        singlyLinkedList.push(-10);
        singlyLinkedList.push(20);

        System.out.println("tail " + singlyLinkedList.tail.data);

        singlyLinkedList.dalete(2);

        singlyLinkedList.traverse();
    }
}
