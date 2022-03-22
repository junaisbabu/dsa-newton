package OwnEffect;

public class SinglyLinkedListExample1 {

    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private void traverse() {
        if(head == null)
            System.out.println("List is empty...");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");

                temp = temp.next;
            }
            System.out.println();
        }
    }



    private void puch(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;

    }

    public static void main(String[] args) {
        SinglyLinkedListExample1 singlyLinkedListExample1 = new SinglyLinkedListExample1();

        singlyLinkedListExample1.traverse();

        singlyLinkedListExample1.puch(32);
        singlyLinkedListExample1.puch(88);
        singlyLinkedListExample1.puch(100);



        singlyLinkedListExample1.traverse();
    }

}
