package Recursion;

import java.util.ArrayList;
import java.util.List;
//  ИМаме множество от символни низове. програма, която генерира всички подмножества съставено от k на брой символни низа, избрани измежду елементите на това множество.
//Примерен вход:
//strings = {'test', 'rock', 'fun'}
//k = 2
//Примерен изход:
//(test rock), (test fun), (rock fun)
public class SubsetsOfStrings {
    public static void main(String[] args) {
        String[] strings = {"test", "rock", "fun"};
        int k = 2;
        List<String[]> result = new ArrayList<>();
        String[] subset = new String[k];
        generateSubsets(strings, k, 0, 0, subset, result);

        for (String[] sub : result) {
            System.out.print("(");
            for (int i = 0; i < sub.length; i++) {
                System.out.print(sub[i] + (i < sub.length - 1 ? " " : ""));
            }
            System.out.print(")");
            System.out.println();
        }
    }

    private static void generateSubsets(String[] strings, int k, int index, int start, String[] subset, List<String[]> result) {
        if (index == k) {
            result.add(subset.clone());
            return;
        }

        for (int i = start; i < strings.length; i++) {
            subset[index] = strings[i];
            generateSubsets(strings, k, index + 1, i + 1, subset, result);
        }
    }
}

