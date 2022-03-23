import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode right,left;
    TreeNode(int val){
        this.val = val;
    }
}

class BST{
    TreeNode root;
    BST(){

    }
    TreeNode insert(TreeNode root,int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    //delete a Node
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            return helper(root);
        }
        TreeNode dummy = root;
        while (root != null) {
            if (root.val > key) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                } else {
                    root = root.right;
                }
            }
        }
        return dummy;
    }
    public TreeNode helper(TreeNode root) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                TreeNode rightChild = root.right;
                TreeNode lastRight = findLastRight(root.left);
                lastRight.right = rightChild;
                return root.left;
            }
    }
    public TreeNode findLastRight(TreeNode root) {
        if (root.right == null) {
            return root;
        }
        return findLastRight(root.right);
    }
    // void preOrder(TreeNode curr){
    //     System.out.print(curr.val+" ");
    //     preOrder(curr.left);
    //     preOrder(curr.right);
    // }
}

public class DeleteTreeNode {
    public static void preOrder(TreeNode curr, BST t){
        if(curr == null) return;
        System.out.print(curr.val+" ");
        preOrder(curr.left, t);
        preOrder(curr.right, t); 
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            BST t = new BST();
            for(int i=0;i<n;i++){
                t.root = t.insert(t.root,sc.nextInt());
            }
            t.deleteNode(t.root, x);
            preOrder(t.root,t);
        }    
        
}
