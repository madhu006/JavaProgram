package developer;

public class ReverseLinkedList {
 
    public static void main (String args[]){
 
        //build a singly linked list
 
        //a -> b -> c -> d -> e
 
        Node a = new Node ("a");
 
        Node b = new Node ("b");
 
        Node c = new Node ("c");
 
        Node d = new Node ("d");
 
        Node e = new Node ("e");
 
        a.next = b;
 
        b.next = c;
 
        c.next = d;
 
        d.next = e;
 
        SinglyLinkedList list = new SinglyLinkedList();
 
        list.head  = a;
 
        System.out.println ("Original list");
 
        list.print(list.head);
 
        list.reverse ();
 
        System.out.println ("\n\nList reversed with procedural method");
 
        list.print(list.head);
 
        list.reverse (null, list.head);
 
        System.out.println ("\n\nList re-reversed with recursive method");
 
        list.print(list.head);
 
    }
 
}
 
class SinglyLinkedList {
 
    Node     head;
 
    public void print(Node node){
 
        System.out.print (node);
 
        if (node.next!=null){
 
            System.out.print (" -> ");
 
            print(node.next);
 
        }
 
    }
 
    //procedural reverse
 
    public void   reverse() {
 
        Node n3 = head;
 
        Node n2 = null;
 
        Node n1 = null;
 
        while (n3!= null) {
 
            n1 = n2;
 
            n2 = n3;
 
            n3 = n2.next;
 
            n2.next = n1;
 
        }
 
        head = n2;
 
    }
 
    //recursive reverse
 
    public void reverse (Node n1, Node n2){
 
        Node n3 = n2.next;
 
        n2.next = n1;
 
        if (n3!=null){
 
            reverse (n2, n3);
 
        }else {
 
            head = n2;
 
        }
 
    }
 
}
 
class Node {
 
    Node   next;
 
    String value;
 
    Node (String value ) {
 
        this.value = value;
 
    }
 
    public String toString () {
 
        return value;
 
    }
}