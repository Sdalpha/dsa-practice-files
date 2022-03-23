package tree;

import java.util.*;

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
    }
}
class Tree{  

    public static void main(String[] args) {
        Node root = createTree();
        Scanner sc = new Scanner(System.in);
        inOrder(root);
        System.out.println("");
        preOrder(root);
        System.out.println("");
        postOrder(root);
        System.out.println("");
        sc.close();
    }
    
    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter data : ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.print("enter left for "+data);
        root.left = createTree();
        System.out.print("enter right for "+data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;
        
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
