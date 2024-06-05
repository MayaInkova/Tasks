package Recursion;

import java.util.ArrayList;
import java.util.List;

//програма, която генерира всички вариации с повторение на n елемента от k-ти клас.
//Примерен вход:
//n = 3
//к = 2
//Примерен изход:
//(1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)

public class VariationsWithRepetition {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        List<int[]> result = new ArrayList<>();
        int[] variation = new int[k];
        generateVariations(n, k, 0, variation, result);

        for (int[] var : result) {
            System.out.print("(");
            for (int i = 0; i < var.length; i++) {
                System.out.print(var[i] + (i < var.length - 1 ? " " : ""));
            }
            System.out.print(")");
            System.out.println();
        }
    }

    private static void generateVariations(int n, int k, int index, int[] variation, List<int[]> result) {
        if (index == k) {
            result.add(variation.clone());
            return;
        }

        for (int i = 1; i <= n; i++) {
            variation[index] = i;
            generateVariations(n, k, index + 1, variation, result);
        }
    }
}
