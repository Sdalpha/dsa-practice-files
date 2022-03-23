// package LinkedList;

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         next = null;
//     }
// }
// class LinkedList{
//     Node head;
//     void add(int data){
//         Node new_node = new Node(data);
//         if(head == null){
//             head = new_node;
//             return;
//         }
//         Node curr = head;
//         while(curr.next != null)
//             curr = curr.next;
//         curr.next = new_node;
//     }
// }

// public class SwapKth {
//         public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int k = input.nextInt();
//         LinkedList list = new LinkedList();
//         for(int i = 0; i < n; i++){
//             int x = input.nextInt();
//             list.add(x);
//         }
//         if(k == 1 || k == n){
//             k = 1;
//             Node next1 = list.head;
//             Node prev2 = list.head;
//             for(int i = 1; i < n - 1; i++){
//                 prev2 = prev2.next;
//             }
//             Node next2 = prev2.next;
//             prev2.next = next1;
//             Node temp = next1.next;
//             next1.next = next2.next;
//             next2.next = temp;
//             list.head = next2;
//         }else{
//             Node prev1 = list.head;
//             for(int i = 1; i < k - 1; i++){
//                 prev1 = prev1.next;
//             }
//             Node next1 = prev1.next;
//             Node prev2 = list.head;
//             for(int i = 1; i < n - k; i++){
//                 prev2 = prev2.next;
//             }
//             Node next2 = prev2.next;
//             Node temp = prev1.next;
//             prev1.next = prev2.next;
//             prev2.next = temp;
//             temp = next1.next;
//             next1.next = next2.next;
//             next2.next = temp;
//         }
//         Node h = list.head;
//         while(h != null){
//             System.out.print(h.data + " ");
//             h = h.next;
//         }
//         System.out.println("");
        
//     }
// }
