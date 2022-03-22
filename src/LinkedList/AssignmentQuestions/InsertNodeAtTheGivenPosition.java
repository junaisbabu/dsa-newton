package LinkedList.AssignmentQuestions;

public class InsertNodeAtTheGivenPosition {

static class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}


    public static Node addElement(Node head, int k ,int pos ) {

        int currentPosition = 1;
        if (pos == 1) {
            Node temp = new Node(k);

            temp.next = head;
            return temp;
        }
        Node temp = head;
        while (currentPosition != pos - 1) {
            temp = temp.next;
            currentPosition++;
        }
        Node x = new Node(k);
        x.next = temp.next;
        temp.next = x;
        return head;

    }

    public static void main(String[] args) {

    }
}
