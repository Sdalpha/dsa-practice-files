package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedListt{
    Node head = null;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head = head.next;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;

    }
    void print(Node head){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }System.out.println();
    }
}
public class reversell {
    public static Node reverse(Node head){
        Node dummy = null;
        
        while(head!=null){
            Node next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        head = dummy;
        return head;
    }
    public static Node delete(Node head){
        Node curr = head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next = null;
        return head;
    }

    public static Node exchangeNodes(Node head)
    {
 
        // If list is of length 2
        if (head.next.next == head) {
            head = head.next;
            return head;
        }
        // Find pointer to previous
        // of last node
        Node p = head;
        while (p.next.next != head)
            p = p.next;
 
        // Exchange first and last
        // nodes using head and p
        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;
 
        return head;
    }
    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print(list.head);
        // list.head = reverse(list.head);
        // list.print(list.head);  
        // list.head = delete(list.head);
        // list.print(list.head);    
        // list.head = exchangeNodes(list.head);
    }
    
}
