package labexperiments;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        String grade;
       
        if (percentage >= 90)
        {
        	System.out.print("Excellent work!");
            
           
        }
        else if (percentage >= 80)
        {
        	System.out.print("Good job!");
           
        } 
        else if (percentage >= 70)
        {
        	System.out.print("You can do better");
           
        }
        else if (percentage >= 60) 
        {
        	System.out.print("Work harder");
           
        } 
        else
        {
        	System.out.print("Failed. Try again");
           
        }

        
        scanner.close();
    }
}
