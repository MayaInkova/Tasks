package arrays;

public class MaxRowSum {
    public static void main(String[] args) {
        // Примерен двумерен масив
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }
            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                maxRowIndex = i;
            }
        }

        System.out.println("Редът с най-голяма сума е: " + maxRowIndex);
        System.out.println("Сумата е: " + maxSum);
    }
}
