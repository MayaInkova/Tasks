package arrays;
// програма, която сортира масив. Да се използва алгоритъма "Selection sort".
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Масивът преди сортирането:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nМасивът след сортирането:");
        printArray(array);
    }

    // Метод за сортиране на масива с "Selection sort"
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Преминаваме през всеки елемент на масива
        for (int i = 0; i < n - 1; i++) {
            // Намираме най-малкия елемент в несортираната част на масива
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Разменяме най-малкия елемент с текущия
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Метод за отпечатване на масива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

