public class LinkedList {
    static class Node{
        int data ;
        Node next;
        Node(){
            data=0 ;
            next =null;
        }
        Node(int val){
            this.data=val;
            next=null;
        }
    }

    public static void main(String[] args) {
    Node  n1=new Node(12);
    n1.next=new Node(22);
    n1.next.next=new Node(54);
        n1.next.next.next=new Node(50);
        n1.next.next.next.next=new Node(60);
    Node temp=n1;
    while (temp.next!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
        System.out.println(temp.data);
    }
}
