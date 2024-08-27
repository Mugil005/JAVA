import java.util.*;
class test{
    public static boolean isSorted(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] > row[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static int countSortedRows(int[][] matrix) {
        int sortedCount = 0;
        for (int[] row : matrix) {
            if (isSorted(row)) {
                sortedCount++;
            }
        }
        return sortedCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int numCols = scanner.nextInt();
        int[][] matrix = new int[numRows][numCols];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = countSortedRows(matrix);
        System.out.println("Number of sorted rows: " + result);

        scanner.close();
    }
}
