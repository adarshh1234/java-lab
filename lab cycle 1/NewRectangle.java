package labexperiments;

class NewRectangle {
    private double length, width; // Variables to store length and width

    // Default constructor sets length and width to 1
    public NewRectangle() {
        this(1, 1);
    }

    // Parameterized constructor to initialize length and width
    public NewRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + area() + ", Perimeter: " + perimeter());
    }

    // Main method to test the NewRectangle class
    public static void main(String[] args) {
        NewRectangle r1 = new NewRectangle(); // Creates a rectangle with default values
        NewRectangle r2 = new NewRectangle(5, 3); // Creates a rectangle with given length and width
        
        r1.display(); // Display details of default rectangle
        r2.display(); // Display details of custom rectangle
    }
}
