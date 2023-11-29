public class Main {
    public static void main(String[] args) {
    BinaryTree<Integer> binaryTree1 = new BinaryTree<>();
    BinaryTree<Integer> binaryTree = new BinaryTree<>();

    // UC 1: Add nodes 56, 30, and 70
     binaryTree1.insert( 56);
     binaryTree1.insert(30);
     binaryTree1.insert( 70);
     binaryTree1.inOrderTraversal();

     // UC 2:  create the given binary tree and check the size of the binary tree
     binaryTree.insert( 56);
     binaryTree.insert(30);
     binaryTree.insert( 70);
     binaryTree.insert( 22);
     binaryTree.insert(40);
     binaryTree.insert( 11);
     binaryTree.insert( 3);
     binaryTree.insert( 16);
     binaryTree.insert( 60);
     binaryTree.insert(95);
     binaryTree.insert( 65);
     binaryTree.insert( 63);
     binaryTree.insert( 67);
     binaryTree.inOrderTraversal();
        
      System.out.println("\nThe size of the binary tree is: " + binaryTree.size());
        // UC 3: Search for key 63
        int keyToSearch = 63;
        boolean isKeyPresent = binaryTree.searchKey(keyToSearch);
        System.out.println("Key " + keyToSearch + " is present: " + isKeyPresent);
    }
}
