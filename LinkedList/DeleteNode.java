package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedListDelete{
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head ;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    void delete(int pos){
        if(pos == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;            
        }
        prev.next = prev.next.next;
        
    }
    void printList(Node curr){

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}

public class DeleteNode {
    public static void main(String[] args) {
        LinkedListDelete list = new LinkedListDelete();
        list.add(4);
        list.add(5);
        list.add(8);
        list.printList(list.head);
        list.delete(0);System.out.println();
        list.printList(list.head);
    }
}
