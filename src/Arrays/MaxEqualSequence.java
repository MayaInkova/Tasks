package Arrays;
//програма, която намира максималната редица от еднакви елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} à {2, 2, 2}.
public class MaxEqualSequence {
    public static void main(String[] args) {
        int[] array = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};

        int maxLength = 1;
        int maxIndex = 0;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxIndex = i - maxLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxIndex = array.length - maxLength;
        }

        System.out.print("Максималната редица от еднакви елементи е: ");
        for (int i = maxIndex; i < maxIndex + maxLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
