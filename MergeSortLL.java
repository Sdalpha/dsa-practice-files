import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
}

public class MergeSortLL {
    public static Node merge(Node head1,Node head2){
        Node merged = new Node(-1);
        Node temp = merged;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    public static Node findMid(Node head){
        Node slow = head; Node fast = head.next;
        while(slow!=null && fast!=null){
            fast = fast.next;
            if(fast==null){
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node mergeSort(Node head){
        if(head.next==null){
            return head;
        }
        Node mid = findMid(head);
        Node head1 = head;
        Node head2 = mid.next;
        mid.next = null;
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        return merge(head1,head2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }        

        list.head = mergeSort(list.head);
        Node curr = list.head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }System.out.println("");
        sc.close();
    }
}
