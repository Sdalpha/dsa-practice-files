import java.util.Scanner;

class TreeNode{
    int val;
    public TreeNode left,right;
    TreeNode(int val){
        this.val = val;
    }
}

public class MirrorBST {
    TreeNode root;
    MirrorBST(){
        root = null;
    }

    TreeNode insert(TreeNode root,int val){
        TreeNode newNode = new TreeNode(val);

        if(root == null){
            root = newNode;
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right  =insert(root.right,val);
        }
        return  root;
    }

    void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.val+" ");
            inOrder(root.right);
        }
    }
    public TreeNode mirror(TreeNode root){
        if(root != null){
            TreeNode temp = root.left;
            root.left = mirror(root.right);
            root.right = mirror(temp);
        }
        return root;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MirrorBST tree = new MirrorBST();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            tree.root = tree.insert(tree.root, x);
        }
        tree.mirror(tree.root);
        tree.inOrder(tree.root);

        sc.close();
    }
}
