package algorithms;

public class DiagonalElements {
    public static void main(String[] args) {
        // Примерен квадратен двумерен масив
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        System.out.println("Главен диагонал:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            mainDiagonalSum += matrix[i][i];
        }
        System.out.println("\nСума на главния диагонал: " + mainDiagonalSum);

        System.out.println("Второстепенен диагонал:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        System.out.println("\nСума на второстепенния диагонал: " + secondaryDiagonalSum);
    }
}
