package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//

public class Subsets {

    private static String[] words = {"море", "бира", "пари", "кеф"};

    public static void main(String[] args) {
        // Създаване на опашка за съхранение на подмножества
        Queue<ArrayList<Integer>> subsetsQueue = new LinkedList<ArrayList<Integer>>();
        // Създаване на празно множество и добавянето му в опашката
        ArrayList<Integer> emptySet = new ArrayList<Integer>();
        subsetsQueue.offer(emptySet);

        // Докато опашката не е празна
        while (!subsetsQueue.isEmpty()) {
            // Взимане на първото множество от опашката
            ArrayList<Integer> subset = subsetsQueue.poll();
            // Печат на текущото множество
            print(subset);
            int start = -1;
            if (subset.size() > 0) {
                start = subset.get(subset.size() - 1);
            }

            // Генериране на нови подмножества
            for (int index = start + 1; index < words.length; index++) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(index);
                subsetsQueue.offer(newSubset);
            }
        }
    }

    // Метод за печат на подмножество
    private static void print(ArrayList<Integer> subset) {
        System.out.print("[ ");
        for (int i = 0; i < subset.size(); i++) {
            int index = subset.get(i);
            System.out.print(words[index] + " ");
        }
        System.out.println("]");
    }
}