package labexperiments;

public class Symmetric {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        
        if (rows != columns) {
            System.out.println("The matrix is not square, so it cannot be symmetric.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("The matrix is not symmetric.");
                    return;
                }
            }
        }

        System.out.println("The matrix is symmetric.");
    }
}
