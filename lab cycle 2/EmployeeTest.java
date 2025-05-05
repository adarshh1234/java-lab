package labexperiments;

//Abstract class Employee
abstract class Employee {
 String name;
 int id;

 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 abstract double calculateSalary();
}

//FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
 double monthlySalary;

 FullTimeEmployee(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 double calculateSalary() {
     return monthlySalary;
 }
}

//PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
 double hourlyRate;
 int hoursWorked;

 PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

//Main class
public class EmployeeTest {
 public static void main(String[] args) {
     FullTimeEmployee f = new FullTimeEmployee("Adarsh", 1, 30000);
     System.out.println("Full Time Employee Salary: " + f.calculateSalary());

     PartTimeEmployee p = new PartTimeEmployee("Azeem", 2, 200, 50);
     System.out.println("Part Time Employee Salary: " + p.calculateSalary());
 }
}
