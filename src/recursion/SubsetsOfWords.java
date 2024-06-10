package recursion;

import java.util.ArrayList;
import java.util.List;
//програма, която отпечатва всички подмножества на дадено множество от думи.
//Примерен вход:
//words = {'test', 'rock', 'fun'}
//Примерен изход:
//(), (test), (rock), (fun), (test rock), (test fun),
//(rock fun), (test rock fun)
public class SubsetsOfWords {

    public static void main(String[] args) {
        String[] words = {"test", "rock", "fun"};
        printSubsets(words);
    }

    public static void printSubsets(String[] words) {
        int n = words.length;
        for (int i = 0; i < (1 << n); i++) {
            List<String> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(words[j]);
                }
            }
            System.out.print("(");
            for (int k = 0; k < subset.size(); k++) {
                System.out.print(subset.get(k));
                if (k < subset.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("), ");
        }
    }
}
