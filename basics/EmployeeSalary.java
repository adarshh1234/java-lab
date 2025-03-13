package labexperiments;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter the employee role (Manager, Developer, Intern): ");
        String role = sc.nextLine();

     
        System.out.print("Enter experience in number of years: ");
        int experience = sc.nextInt();

        double baseSalary = 0;

     
        if (role.equalsIgnoreCase("Manager")) {
            baseSalary = 50000;
        } else if (role.equalsIgnoreCase("Developer")) {
            baseSalary = 30000;
        } else if (role.equalsIgnoreCase("Intern")) {
            baseSalary = 15000;
        } else {
            System.out.println("Invalid role entered!");
            sc.close(); 
            return;
        }

      
        double bonus = 0;
        if (experience >= 3 && experience <= 5) {
            bonus = baseSalary * 0.10; 
        } else if (experience > 5) {
            bonus = baseSalary * 0.20;
        }

  
        double totalSalary = baseSalary + bonus;

       
        System.out.println("\nEmployee Salary Details:");
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);

        sc.close(); 
    }
}
