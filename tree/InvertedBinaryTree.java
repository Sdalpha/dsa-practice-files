// import java.util.Scanner;

public class InvertedBinaryTree {
    public static TreeNode invertTree(BST t,TreeNode root){
        if(root != null){
            TreeNode temp = root.left;
            root.left = invertTree(t,root.right);
            root.right = invertTree(t,temp);
        }
        return root;
    }
    public static void main(String[] args) {
        BST t = new BST();
        t.insert(t.root, 4);
        t.insert(t.root, 2);
        t.insert(t.root, 7);
        t.insert(t.root, 1);
        t.insert(t.root, 3);
        t.insert(t.root, 6);
        t.insert(t.root, 9);

        t.root = invertTree(t,t.root);
        t.inOrder(t.root);
    }
}
