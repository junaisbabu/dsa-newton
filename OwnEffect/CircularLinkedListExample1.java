package OwnEffect;

import LinkedList.CircularLinkedList;

public class CircularLinkedListExample1 {
    Node head;
    Node tail;
    int size;
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private void traverse() {

        if(head == null) {
            System.out.println("Empty List");
        }
        else {
            Node temp = head;

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
            System.out.println();
        }

        System.out.println("Size : " + size);
    }

    private void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else if(head == tail) {
            tail.next = null;
            head = tail = null;

            size --;
        }
        else {
            Node temp = head;

            head = head.next;
            temp.next = null;
            tail.next = head;

            size --;
        }

    }

    private void deleteEnd() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else if(head == tail) {
            tail.next = null;
            head = tail = null;

            size --;
        }
        else {
            int currentPosition = 1;
            Node temp = head;

            while (currentPosition != (size - 1)) {
                temp = temp.next;
                currentPosition ++;
            }

            temp.next = head;
            tail.next = null;
            tail = temp;

            size --;
        }
    }

    private void deleteAtPosition(int position) {
        if(position < 1 || position > (size + 1)) {
            System.out.println("Invalid position");
        }
        else {
            if(position == 1) {
                deleteFirst();
            }
            else if(position == size) {
                deleteEnd();
            }
            else {
                Node temp = head;
                int currentPosition = 1;

                while(currentPosition != (position - 1)) {
                    temp = temp.next;
                    currentPosition++;
                }

                Node delete = temp.next;
                temp.next = delete.next;
                delete.next = null;

                size--;
            }
        }
    }

    private void insertAtStart(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            head.next = head;
            tail = head;
        }
        else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size ++;
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }

        size ++;
    }

    private void insertAtPosition(int data, int position) {

        if(position < 1 || position > (size + 1)) {
            System.out.println("Invalid position");
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


    public static void main(String[] args) {
        CircularLinkedListExample1 circularLinkedList = new CircularLinkedListExample1();

        circularLinkedList.insertAtEnd(44);
        circularLinkedList.insertAtEnd(100);
        circularLinkedList.insertAtEnd(200);

        circularLinkedList.traverse();

        circularLinkedList.insertAtStart(4);
        circularLinkedList.insertAtStart(5);
        circularLinkedList.insertAtStart(6);
        circularLinkedList.insertAtStart(7);

        circularLinkedList.traverse();

        circularLinkedList.insertAtPosition(1000, 5);
        circularLinkedList.insertAtPosition(9883, 1);
        circularLinkedList.insertAtPosition(3919, 8);

        circularLinkedList.traverse();

        /*
        System.out.println("Deletion First Node");
        circularLinkedList.deleteFirst();
        circularLinkedList.traverse();

        System.out.println("Deletion Last Node");
        circularLinkedList.deleteEnd();
        circularLinkedList.traverse();
        */


        System.out.println("............Deletion...........");

        circularLinkedList.deleteAtPosition(1);
        circularLinkedList.deleteAtPosition(9);
        circularLinkedList.deleteAtPosition(9);
//        circularLinkedList.deleteAtPosition(5);
//        circularLinkedList.deleteAtPosition(3);

        circularLinkedList.traverse();
    }
}
