package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class Linkedlist{
    Node head ;
    Linkedlist(){
        head = null;
    }
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next = newNode;
    }
    void printNode(){
        if(head == null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

}
class DeleteMiddleNode{
    public static Node deleteMiddle(Node head){
        if(head==null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
        Linkedlist list  = new Linkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(10);
        
        list.head = deleteMiddle(list.head);
        list.printNode();
    }
}