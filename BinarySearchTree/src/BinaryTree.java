
public class BinaryTree<T extends Comparable<T>> {
    MyBinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }
    // UC 3: Search for a key in the binary tree
    public boolean searchKey(T key) {
        return search(root, key);
    }
    
     void insert(T data){
        root = insertB(root,data);
    }

     MyBinaryNode<T> insertB(MyBinaryNode<T> root, T key) {
        if(root == null){
            root = new MyBinaryNode<>(key);
            return root;
        }
        if(key.compareTo(root.key) < 0){
            root.left = insertB(root.left,key);
        } else if(key.compareTo(root.key) > 0){
            root.right = insertB(root.right,key);
        }
        return root;
    }

    // Search for a key in the BST
    private boolean search(MyBinaryNode<T> root, T key) {
        if (root == null || root.key.equals(key)) {
            return root != null;
        }

        if (key.compareTo(root.key) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    // UC 2: Check the size of the binary tree
    public int size() {
        return sizeB(root);
    }
    private int sizeB(MyBinaryNode<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeB(node.left) + sizeB(node.right);
    }


    public void inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }

     void inOrderTraversal(MyBinaryNode<T> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }
}



