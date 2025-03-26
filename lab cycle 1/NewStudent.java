package labexperiments;

class NewStudent {
    private int id;
    private String name;
    private double marks;

    // Constructor
    public NewStudent(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Passed: " + (marks >= 40));
    }

    // Main method to test the NewStudent class
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent(101, "Adarsh", 95.5);
        NewStudent s2 = new NewStudent(102, "Azeem", 85.0);
        NewStudent s3 = new NewStudent(103, "Aromal", 99.0);

        s1.display();
        s2.display();
        s3.display();
    }
}
