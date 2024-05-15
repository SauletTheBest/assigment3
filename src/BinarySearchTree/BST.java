package BinarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class BST<K extends Comparable<K>, V> {
    private Node root;
    private int size;

    // Define the Node class
    public class Node {
        public K key;
        public V value;
        private Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public BST() {
        size = 0;
    }

    // Put method to insert key-value pair
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    // Recursive helper method for put
    private Node put(Node node, K key, V value) {
        if (node == null) {
            size++;
            return new Node(key, value);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);
        } else {
            // Update value if key already exists
            node.value = value;
        }

        return node;
    }

    // Get method to retrieve value associated with key
    public V get(K key) {
        Node node = get(root, key);
        return node == null ? null : node.value;
    }

    // Recursive helper method for get
    private Node get(Node node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node;
        }
    }

    // Delete method to remove key-value pair
    public void delete(K key) {
        root = delete(root, key);
    }

    // Recursive helper method for delete
    private Node delete(Node node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.right == null) {
                return node.left;
            }
            if (node.left == null) {
                return node.right;
            }

            Node temp = node;
            node = min(temp.right);
            node.right = deleteMin(temp.right);
            node.left = temp.left;
        }

        return node;
    }

    // Find the node with minimum key in the subtree
    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    // Delete the node with minimum key in the subtree
    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    // In-order traversal to provide an iterator that returns elements in sorted order
    public Iterable<Node> iterator() {
        List<Node> nodeList = new ArrayList<>();
        inorderTraversal(root, nodeList);
        return nodeList;
    }

    // In-order traversal helper method
    private void inorderTraversal(Node node, List<Node> nodeList) {
        if (node != null) {
            inorderTraversal(node.left, nodeList);
            nodeList.add(node);
            inorderTraversal(node.right, nodeList);
        }
    }
}

