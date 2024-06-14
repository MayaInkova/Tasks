package symbol;

public class indexOf {
    public static void main(String[] args) {
        String text = "Hello World! This is a simple test for finding a substring in a string.";
        String substring = "string";

        // Обърнете регистъра на буквите в текста
        String reversedCaseText = reverseCase(text);

        // Търсене на подниз в текста
        int index = 0;
        while ((index = reversedCaseText.indexOf(substring, index)) != -1) {
            System.out.println("Found substring at index: " + index);
            index += substring.length(); // Преместване на индекса за да избегнем безкраен цикъл
        }
    }

    // Метод за обръщане на регистъра на буквите
    public static String reverseCase(String text) {
        StringBuilder reversedCaseText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                reversedCaseText.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                reversedCaseText.append(Character.toUpperCase(c));
            } else {
                reversedCaseText.append(c);
            }
        }
        return reversedCaseText.toString();
    }
}
