package labexperiments;

import java.util.Scanner;

public class StringSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        
        String arr[] = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        // Bubble Sort for sorting strings
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) { // Swap if out of order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted strings
        System.out.println("\nSorted array of strings:");
        for (String str : arr) {
            System.out.println(str);
        }

        sc.close();
    }
}
