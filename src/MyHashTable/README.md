MyHashTable.MyHashTable Class
Overview:

The MyHashTable class represents a generic hash table data structure with separate chaining collision resolution. It allows the insertion, retrieval, and deletion of key-value pairs, as well as checking for containment and retrieving keys based on values.
Constructors:

    MyHashTable(): Constructs a hash table with default capacity.

    MyHashTable(int capacity): Constructs a hash table with the specified capacity.

Methods:

    put(K key, V value): Inserts a key-value pair into the hash table.

    get(K key): Retrieves the value associated with the specified key from the hash table.

    remove(K key): Removes the key-value pair associated with the specified key from the hash table.

    contains(V value): Checks if the hash table contains the specified value.

    getKey(V value): Retrieves the key associated with the specified value from the hash table.

Example Usage:

java

MyHashTable<Integer, String> table = new MyHashTable<>();
table.put(1, "One");
table.put(2, "Two");
System.out.println(table.get(1)); // Output: One
table.remove(2);

These classes provide essential functionalities for managing key-value pairs efficiently. You can use them in various applications where fast retrieval and storage of data are required.
