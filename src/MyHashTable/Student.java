package MyHashTable;

public class TestHashTable {
    public static void main(String[] args) {
        // Create a hash table with MyTestingClass as keys and Student as values
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        // Create instances of MyTestingClass and Student for testing
        MyTestingClass key1 = new MyTestingClass(1, "Test1");
        MyTestingClass key2 = new MyTestingClass(2, "Test2");
        MyTestingClass key3 = new MyTestingClass(3, "Test3");

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);
        Student student3 = new Student("Bob", 21);

        // Insert key-value pairs into the hash table
        table.put(key1, student1);
        table.put(key2, student2);
        table.put(key3, student3);

        // Retrieve and print values associated with keys
        System.out.println("Value associated with key1: " + table.get(key1));
        System.out.println("Value associated with key2: " + table.get(key2));
        System.out.println("Value associated with key3: " + table.get(key3));

        // Remove a key-value pair
        table.remove(key2);
        System.out.println("Value associated with key2 after removal: " + table.get(key2));

        // Check if a value exists in the hash table
        System.out.println("Does the table contain student1? " + table.contains(student1));
        System.out.println("Does the table contain student2? " + table.contains(student2));

        // Get the key associated with a value
        System.out.println("Key associated with student1: " + table.getKey(student1));
    }
}

}
