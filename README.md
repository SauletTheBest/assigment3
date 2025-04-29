# Basic Data Structures in Java

This project contains basic implementations of common data structures in Java. It's primarily intended for educational purposes, demonstrating how these fundamental structures can be built from scratch.

## Included Data Structures

The project currently includes the following data structure implementations:

* **`MyArrayList.java`**: A dynamic array implementation that allows for resizing as elements are added or removed.
* **`MyLinkedList.java`**: A linked list implementation where elements are stored in nodes that are linked together.
* **`MyList.java`**: (Likely) An interface defining the common methods for list-like data structures.
* **`MyMinHeap.java`**: A min-heap implementation, a tree-based data structure where the smallest element is always at the root.
* **`MyQueue.java`**: A queue implementation following the First-In, First-Out (FIFO) principle.
* **`MyStack.java`**: A stack implementation following the Last-In, First-Out (LIFO) principle.

## `Main.java`

The `Main.java` file contains a simple program that demonstrates the basic functionality of the implemented data structures. It performs the following actions:

* Tests the `MyArrayList` by adding elements, checking its size, retrieving an element, removing an element, and clearing the list.
* Tests the `MyLinkedList` by adding elements, checking its size, retrieving an element, removing an element, and clearing the list.
* Demonstrates the `MyStack` by pushing elements onto it. (Note: Operations like `pop` or peeking at the top element are not explicitly shown in the provided code snippet).
* Demonstrates the `MyQueue` by adding elements to the end and then removing one element from the front, followed by checking the size.

## Getting Started

To run this project, you will need to have the Java Development Kit (JDK) installed on your system.

1.  **Clone the repository** (if this is part of a Git repository).
2.  **Navigate to the project directory** in your terminal or command prompt.
3.  **Compile the Java files:**
    ```bash
    javac *.java
    ```
4.  **Run the `Main` class:**
    ```bash
    java Main
    ```

This will execute the `Main` program and print the output of the tests performed on the different data structures to the console.

## Purpose

This project serves as a learning resource for understanding the underlying principles of common data structures. By implementing these structures from scratch, one can gain a deeper appreciation for how they work and their respective time and space complexities.

## Further Development

Potential areas for further development could include:

* Implementing the `MyList` interface in `MyArrayList` and `MyLinkedList`.
* Adding more comprehensive test cases in `Main.java` to cover all methods of each data structure.
* Implementing other common data structures like hash tables, trees (e.g., binary search trees), and graphs.
* Adding comments to the code for better understanding.
