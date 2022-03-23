package tree;


class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int value){
        this.val = value;
    } 
}
public class BST {
    TreeNode root;

    BST() {
        root = null;
    }

    TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);

        if (root == null) {
            root = newNode;
            return root;
        }

        if (root.val > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key > root.val) {
            root.right = delete(root.right, key);
        } else if (key < root.val) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null) { // case for 1 child
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.val = inOrderSuccessor(root.right);

            root.right = delete(root.right, root.val);
        }

        return root;
    }

    int inOrderSuccessor(TreeNode root) {
        int succ = root.val;
        while (root.left != null) {
            succ = root.left.val;
            root = root.left;
        }
        return succ;
    }

    void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }

    void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(root, 3);
    }
}
