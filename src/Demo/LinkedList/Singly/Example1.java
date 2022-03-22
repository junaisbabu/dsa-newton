package Demo.LinkedList.Singly;

public class Example1 {
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

    private void traverse() {

        if (head == null) {
            System.out.println("There is no list");
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");

                temp = temp.next;
            }
            System.out.println();
        }
    }

    private void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        }
        else {
            newNode.next = head;
        }
        head = newNode;
        size ++;
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = head;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size ++;
    }

    private void insertAtPosition(int data, int position) {

        if(position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            System.out.println("Size : " + size);
        }
        else {
            if(position == 1) {
                insertAtStart(data);
            }
            else if(position == (size + 1)) {
                insertAtEnd(data);
            }
            else {
                int currentPosition = 1;
                Node temp = head;
                while (currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition ++;
                }

                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;

                size ++;
            }
        }
    }

    private void delete(int position) {
        if(position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            System.out.println("Size : " + size);
        }
        else {
            Node temp = head;
            if(position == 1) {
                head = head.next;
                temp.next = null;

            }
            else {
                int currentPosition = 1;


                while (currentPosition != (position - 1)) {
                    temp = temp.next;

                    currentPosition ++;
                }

                Node delete = temp.next;
                temp.next = delete.next;
                delete.next = null;

                if(temp.next == null) {
                    tail = temp;
                }


            }

            size --;
        }
    }

    public static void main(String[] args) {
        Example1 linkedList = new Example1();

        linkedList.traverse();
        linkedList.delete(3);

        linkedList.insertAtStart(7);
        linkedList.insertAtStart(8);
        linkedList.insertAtStart(9);

        linkedList.traverse();

        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.traverse();

        linkedList.insertAtPosition(100, 2);
        linkedList.traverse();
        linkedList.insertAtPosition(200, 4);
        linkedList.traverse();

        linkedList.delete(1);
        linkedList.traverse();

        linkedList.delete(6);
        linkedList.traverse();

        linkedList.delete(3);
        linkedList.traverse();
    }
}
