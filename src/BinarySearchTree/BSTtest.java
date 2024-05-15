package BinarySearchTree;

public class BSTtest {
    public static void main(String[] args) {
        // Create a new BST
        BST<Integer, String> bst = new BST<>();

        // Insert elements into the BST
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(2, "Two");
        bst.put(4, "Four");
        bst.put(6, "Six");
        bst.put(8, "Eight");

        // Retrieve and print values associated with keys
        System.out.println("Value associated with key 5: " + bst.get(5));
        System.out.println("Value associated with key 7: " + bst.get(7));

        // Delete a key-value pair
        bst.delete(3);
        System.out.println("Value associated with key 3 after deletion: " + bst.get(3));

        // Iterate over the BST
        System.out.println("In-order traversal of the BST:");
        for (BST<Integer, String>.Node node : bst.iterator()) {
            System.out.println("Key: " + node.key + ", Value: " + node.value);
        }
    }
}
