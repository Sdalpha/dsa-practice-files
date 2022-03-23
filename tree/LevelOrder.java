import java.io.*;
import java.util.*;
class Node{
  int val;
  Node right,left;
  Node(int val){
    this.right = null;
    this.left = null;
    this.val = val;
  }
}

class BST{
  Node root = null;
  BST(){
    
  }
  Node insert(Node root,int val){
    Node newNode = new Node(val);
    if(root == null){
      root = newNode;
      return root;
    }
    if(val<root.val){
      root.left = insert(root.left,val);
    }else{
      root.right = insert(root.right,val);
    }
    return root;
  }
  
}
public class LevelOrder {

    public static void levelOrder(BST tree,Node root){
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()){
        Node curr = q.poll();
        System.out.print(curr.val+" ");

        if(curr.left!=null)
            q.add(curr.left);
        if(curr.right!=null)
            q.add(curr.right);
      }
    }
  
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      BST tree = new BST();
      for(int i=0;i<n;i++){
        tree.root = tree.insert(tree.root,sc.nextInt());
      }
      levelOrder(tree,tree.root);
    }
}