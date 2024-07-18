package arrays;

public class MaxPlatform2x2 {
    public static void main(String[] args) {

        // Деклариране и инициализиране на матрицата
        int[][] matrix = {
                { 0, 2, 4, 0, 9, 5 },
                { 7, 1, 3, 3, 2, 1 },
                { 1, 3, 9, 8, 5, 6 },
                { 4, 6, 7, 9, 1, 0 }
        };

        // Намерете платформата с максимална сума с размер 2x2
        int bestSum = Integer.MIN_VALUE; // Инициализираме най-добрата сума с минималната стойност на integer
        int bestRow = 0; // Променлива за реда на най-добрата платформа
        int bestCol = 0; // Променлива за колоната на най-добрата платформа

        // Обхождане на матрицата, за да се намери платформата с максимална сума
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                // Изчисляване на сумата на текущата 2x2 платформа
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                // Проверка дали текущата сума е по-голяма от най-добрата намерена досега
                if (sum > bestSum) {
                    bestSum = sum; // Обновяване на най-добрата сума
                    bestRow = row; // Обновяване на реда на най-добрата платформа
                    bestCol = col; // Обновяване на колоната на най-добрата платформа
                }
            }
        }

        // Отпечатване на резултата
        System.out.println("Най-добрата платформа е:");
        System.out.printf("  %d %d%n", matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1]);
        System.out.printf("  %d %d%n", matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1]);
        System.out.printf("Максималната сума е: %d%n", bestSum);
    }
}
