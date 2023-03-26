// link: https://www.youtube.com/watch?v=gKopZSqoVYI&t=349

class LinkedListInsertion {
    public static void main(String[] args) {

        // object createinon start
        Node node1 = new Node();
        node1.data = 1;

        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 4;
        node3.next = node4;

        Node node5 = new Node();
        node5.data = 5;
        node4.next = node5;

        // object createinon ends

        // assign head for the LinkedList
        Node head = node1;

        System.out.println("#### State 0");
        traversalLinkedList(head);

        System.out.println("#### State 0");

        Node beginningNode = new Node();
        beginningNode.data = 0;

        head = insertToBeginning(beginningNode, head);

        System.out.println("#### State 1");
        traversalLinkedList(head);

        System.out.println("#### State 1");

    }

    public static Node insertToBeginning(Node candidate, Node head) {

        candidate.next = head;

        return candidate;

    }

    public static void traversalLinkedList(Node head) {

        Node curr = head; // burda curr One Pointer teknik olarak gorulmeli

        while (curr != null) {

            System.out.println(curr.data);

            curr = curr.next;

        }

    }
}

class Node {
    int data;
    Node next = null;
}