public class ReverseLinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node(11);
        n1.next = new Node(12);
        n1.next.next = new Node(14);
        n1.next.next.next = new Node(18);

        System.out.println("Original List:");
        printList(n1);

        Node reversedHead = reverse(n1);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}