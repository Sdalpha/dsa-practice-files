package OOP;

public class linkedListimp {
    Node head;

    class Node{
        String data;
        Node next;
        

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
         
        if(head == null){
            head = newNode;
            return ;
        }

        newNode.next = head;
        head = newNode;
    }
    //add Last
    public void addLast(String data){
        Node newNode = new Node(data);
         
        if(head == null){
            head = newNode;
            return ;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    public void printList(){
        while(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print( currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


        public static void main(String[] args) {
         linkedListimp list = new linkedListimp();
            list.addFirst("hi");
            list.addFirst("i");
            list.addFirst("am");
            list.addLast("satyajit");
            list.printList();
        }
}
