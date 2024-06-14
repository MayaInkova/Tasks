package symbol;

public class NumberNiz {
    public static void main(String[] args) {
        String text = "We are living in a yellow submarine. We don't have anything else. We are in a state of inaction.";
        String substring = "in";

        int count = countSubstringOccurrences(text, substring);
        System.out.println("The substring \"" + substring + "\" is found " + count + " times in the text.");
    }

    public static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Преместване на индекса след края на намерения подниз
        }

        return count;
    }
}

