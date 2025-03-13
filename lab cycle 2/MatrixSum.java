package labexperiments;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                matrix[i][j] = sc.nextInt();

        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) 
                sum += matrix[i][j];
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) 
                sum += matrix[i][j];
            System.out.println("Column " + (j + 1) + ": " + sum);
        }

        sc.close();
    }
}
