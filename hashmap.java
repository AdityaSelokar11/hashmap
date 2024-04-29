HashMap
////////
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            String[] input = sc.nextLine().split(" ");
            String player = input[0].trim();
            int runs = Integer.parseInt(input[1]);
            
            map.put(player,runs);
            
        }
        
        String PLayerName = sc.nextLine();
        if(map.containsKey(PLayerName)){
            System.out.println(PLayerName + " " + map.get(PLayerName));
            System.out.println("Total number of players: " + map.size());
        }
        
        map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}

////////

TreeSet

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // Print the TreeSet (sorted order)
        System.out.println("TreeSet elements: " + treeSet);

        // Remove an element
        treeSet.remove(5);

        // Check if an element exists
        System.out.println("Contains 15? " + treeSet.contains(15));

        // Iterate through the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
    }
}
/////////
HashSet

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Print the HashSet (order may vary)
        System.out.println("HashSet elements: " + hashSet);

        // Remove an element
        hashSet.remove("Banana");

        // Check if an element exists
        System.out.println("Contains \"Orange\"? " + hashSet.contains("Orange"));

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
/////////
Hashset

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Print the ArrayList (order of insertion)
        System.out.println("ArrayList elements: " + arrayList);

        // Remove an element
        arrayList.remove("Banana");

        // Check if an element exists
        System.out.println("Contains \"Orange\"? " + arrayList.contains("Orange"));

        // Iterate through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
////





