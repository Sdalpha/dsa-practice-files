package LinkedList;

public class exchangeNode {
 
        static class Node {
            int data;
            Node next;
        };
     
        static Node addToEmpty(Node head, int data)
        {
            // This function is only
            // for empty list
            if (head != null)
                return head;
     
            // Creating a node dynamically.
            Node temp = new Node();
     
            // Assigning the data.
            temp.data = data;
            head = temp;
     
            // Creating the link.
            head.next = head;
     
            return head;
        }
     
        static Node addBegin(Node head, int data)
        {
            if (head == null)
                return addToEmpty(head, data);
     
            Node temp = new Node();
     
            temp.data = data;
            temp.next = head.next;
            head.next = temp;
     
            return head;
        }
     
        // function for traversing the list
        static void traverse(Node head)
        {
            Node p;
     
            // If list is empty, return.
            if (head == null) {
                System.out.print("List is empty.");
                return;
            }
     
            // Pointing to first
            // Node of the list.
            p = head;
     
            // Traversing the list.
            do {
                System.out.print(p.data + " ");
                p = p.next;
     
            } while (p != head);
        }
     
        // Function to exchange
        // first and last node
        static Node exchangeNodes(Node head)
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
     
        // Driver Code
        public static void main(String args[])
        {
            int i;
            Node head = null;
            head = addToEmpty(head, 6);
     
            for (i = 5; i > 0; i--)
                head = addBegin(head, i);
            System.out.print("List Before: ");
            traverse(head);
            System.out.println();
     
            System.out.print("List After: ");
            head = exchangeNodes(head);
            traverse(head);
        }
    }
