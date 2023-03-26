import javax.lang.model.SourceVersion;

// link: https://www.youtube.com/watch?v=gKopZSqoVYI&t=349

class LinkedListDeleteNode {
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
        traversalLinkedList(head);

        // delete node3
        LLDeleteNode(node3);

        System.out.println("After deletion");
        traversalLinkedList(head);

    }

    public static void LLDeleteNode(Node delete_candidate) {

        // node3 olarak adlandirdigimiz zaten pointer, "actual node" degil. yani gelen
        // inputun degerlerini degistirmek aslinda istenilen veriyi silmek demek oluyor
        // yani aslinda node 3 u node4 e donusturuyorz

        delete_candidate.data = delete_candidate.next.data;
        delete_candidate.next = delete_candidate.next.next;

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