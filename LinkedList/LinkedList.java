package LinkedList;

import java.util.Scanner;
public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    // Compare two linkedList are equal or not.
    
    boolean  isequal(LinkedList list){
        Node a = this.head, b = list.head;
        while(a != null && b != null){
            if(a.data != b.data)
                return false;
            
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }

    void add(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
                    int n = sc.nextInt();
                    for(int i=0;i<m;i++){
                        list1.add(sc.nextInt());
                    }
                    for(int i=0;i<n;i++){
                        list2.add(sc.nextInt());
                    }
                    if(list1.isequal(list2) == true)
                        System.out.println("1");
                        else
                        System.out.println("0");
                    
                    sc.close();
                }
}

