package OwnEffect;

public class SingleLinkedExample3 {

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
            System.out.println("There is no data");
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


    private void deletePosition(int position) {
        if(position < 1 || position > size) {
            System.out.println("Invalid Position");
        }
        else {
            Node temp = head;
            if(position == 1) {
                head = temp.next;
                temp.next = null;
            }
            else {
                int countPosition = 1;

                while (countPosition != position - 1) {
                    temp = temp.next;
                    countPosition ++;
                }

                Node deleteNode = temp.next;
                temp.next = deleteNode.next;
                deleteNode.next = null;

                if(temp.next == null) {
                    tail = temp.next;
                }
            }
        }

        size --;
    }

    private void pushLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            tail = newNode;
        }

        size ++;
    }

    private void pushFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {

            newNode.next = head;

            head = newNode;
        }

        tail = newNode;

        size ++;
    }

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
        SingleLinkedExample3 s = new SingleLinkedExample3();

        s.push(33);
        s.push(83);
        s.push(100);

        s.pushFirst(388);
        s.pushFirst(01);

        s.pushLast(200);

        s.traverse();

        s.deletePosition(3);
        s.deletePosition(6);
        s.deletePosition(1);
        s.traverse();
    }
}
