package recursion;

import java.util.ArrayList;
import java.util.List;

//програма, която генерира и отпечатва всички комбинации с повторение на k елемента над n-елементно множество.
//Примерен вход:
//n = 3
//к = 2
//Примерен изход:
//(1 1), (1 2), (1 3), (2 2), (2 3), (3 3)
public class CombinationsWithRepetition {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        List<int[]> result = new ArrayList<>();
        int[] combination = new int[k];
        generateCombinations(n, k, 0, 1, combination, result);

        for (int[] comb : result) {
            System.out.print("(");
            for (int i = 0; i < comb.length; i++) {
                System.out.print(comb[i] + (i < comb.length - 1 ? " " : ""));
            }
            System.out.print(")");
            System.out.println();
        }
    }

    private static void generateCombinations(int n, int k, int index, int start, int[] combination, List<int[]> result) {
        if (index == k) {
            result.add(combination.clone());
            return;
        }

        for (int i = start; i <= n; i++) {
            combination[index] = i;
            generateCombinations(n, k, index + 1, i, combination, result);
        }
    }
}

