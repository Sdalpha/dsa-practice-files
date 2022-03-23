package OOP;



// integer Linked lkist by me
// OBJ : intLL ll = new intLL();
// addFirst(data) --> add data to the first position of the linked list
// addLast(data) --> add the data value to the last of the linked list
// printList(); --> print the list of data
//deleteFirst(); --> delete the first element;
//deleteLast(); --> delete the last element;


class LinkedListInt {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){                     //Add First
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){                        //Add Last
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){                            //Deletet First
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }
    public void deleteLast(){                   //delete Last **
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList(){                    //Printing function
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode  =  currNode.next; 
        }
    }
}
