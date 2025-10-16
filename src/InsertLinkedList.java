public class InsertLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(22);
        head.next.next=new Node(54);
        head.next.next.next=new Node(50);
        head.next.next.next.next=new Node(60);
        Node newNode = new Node(100);
        Node temp=head;
        for (int i = 1; i < 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }

}
