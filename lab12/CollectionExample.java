import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a list
        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Displaying elements in the list
        System.out.println("List elements:");
        for (String element : list) {
            System.out.println(element);
        }

        // Creating a set
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate element, ignored

        // Displaying elements in the set
        System.out.println("\nSet elements:");
        for (Integer element : set) {
            System.out.println(element);
        }

        // Creating a map
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Displaying key-value pairs in the map
        System.out.println("\nMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
