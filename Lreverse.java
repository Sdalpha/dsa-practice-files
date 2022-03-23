import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

class Mylinkedlist{
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = newNode;
    }

    // public void printList(){
    //     if(head == null){
    //         System.out.println("List is Empty");
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode != null){
    //         System.out.print(head.data+" ");
    //         currNode = currNode.next;
    //     }
    // }
}
public class Lreverse {
            public static void reverse(Node currNode){
                if(currNode.next!=null){
                    reverse(currNode.next);
                }
                System.out.print(currNode.data+" ");
            }
            public static void main(String[] args) {
            Mylinkedlist list = new Mylinkedlist();
            Scanner sc = new Scanner(System.in);
                        int n = sc.nextInt();
                        for(int i=0;i<n;i++){
                            list.add(sc.nextInt());
                        }
                        reverse(list.head);
                        sc.close(); 
            }
}
