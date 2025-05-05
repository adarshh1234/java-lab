package labexperiments;

class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Employeee extends Person {
    String empId;
    String companyName;
    String qualification;
    double salary;

    public Employeee(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employeee {
    String subject;
    String department;
    String teacherId;

    public Teacher(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void displayTeacher() {
        displayEmployee();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class Teacherdetails {
    public static void main(String[] args) {
        int N = 3;

        Teacher[] teachers = new Teacher[N];

        teachers[0] = new Teacher("Azeem N", "Male", "123 Street", 21, "E101", "TKMCE", "MCA", 50000, "JAVA", "MCA", "T001");
        teachers[1] = new Teacher("Adarsh A", "Male", "Panayam Street", 35, "E102", "CET", "PhD", 60000, "Maths", "Mathematics", "T002");
        teachers[2] = new Teacher("Aromal S", "Male", "Kollam Street", 30, "E103", "TKMIT", "Mtech", 45000, "Python", "Computer Science", "T003");

        for (int i = 0; i < N; i++) {
            System.out.println("\nTeacher " + (i + 1) + " Details:");
            teachers[i].displayTeacher();
            System.out.println();
        }
    }
}
