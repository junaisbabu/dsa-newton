package OwnEffect;

public class SinglyLinkedListExample2 {

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
        if(head == null) {
            System.out.println("There is no data in the list");
        }
        else {
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.data + " ");

                temp = temp.next;
            }
        }
    }

    private void insertAtFirstPosition(int data) {
        Node newNode = new Node(data);

        if(head != null) {
            newNode.next = head;
        }
            head = newNode;

            size ++;
    }

    private void insertAtLastPosition(int data) {
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

    private void insertAtPosition(int data, int position) {

        if(position < 1 || position > (size + 1)) {

            System.out.println("Invalid position");
            System.out.println("size + 1 : " + (size + 1));
        } else {
            if(position == 1)
                insertAtFirstPosition(data);

            else if(position == size + 1)
                insertAtLastPosition(data);

            else {

                Node temp = head;

                int currentPosition = 1;

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
        SinglyLinkedListExample2 s = new SinglyLinkedListExample2();

        s.insertAtLastPosition(100);


        s.insertAtFirstPosition(10);

        s.insertAtFirstPosition(20);

        s.insertAtFirstPosition(30);


        s.insertAtPosition(500, 3);

        s.insertAtPosition(800, 8);

        s.traverse();


    }
}
