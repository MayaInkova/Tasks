package algorithms;

import java.util.HashMap;

// програма , която приема масив от низове и извежда всеки низ с броя на неговите срещания в масива.
// Използвайки HashMap за решението на задачата.

public class StringOccurrences {
    public static void main(String[] args) {
        // Примерен масив от низове
        String[] strings = {"ябълка", "банан", "ябълка", "портокал", "банан", "ябълка"};

        // Създаваме HashMap за съхранение на броя на срещанията на низовете
        HashMap<String, Integer> occurrences = new HashMap<>();

        // Обхождаме масива и броим броя на срещанията на всеки низ
        for (String s : strings) {
            if (occurrences.containsKey(s)) {
                occurrences.put(s, occurrences.get(s) + 1);
            } else {
                occurrences.put(s, 1);
            }
        }

        // Извеждаме резултата
        for (String key : occurrences.keySet()) {
            System.out.println("Низ: \"" + key + "\" се среща " + occurrences.get(key) + " път(и).");
        }
    }
}
