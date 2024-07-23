package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Three"); // Duplicate element
        System.out.println("HashSet: " + hashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet);

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("HashMap: " + hashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap: " + treeMap);

        // PriorityQueue поддържа реда на вмъкване и следва FIFO
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Low");
        priorityQueue.add("High");
        priorityQueue.add("Medium");
        System.out.println("PriorityQueue: " + priorityQueue);

        // ConcurrentHashMap  за изолзване на потоци
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);
        concurrentMap.put("C", 3);
        System.out.println("ConcurrentHashMap: " + concurrentMap);

    }
}
