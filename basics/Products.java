package labexperiments;

class Products {
    int pcode;
    String pname;
    double price;

    // Constructor for initializing product details
    public Products(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        // Creating product objects
        Products product1 = new Products(101, "Rice", 25);
        Products product2 = new Products(102, "Wheat", 15);
        Products product3 = new Products(103, "Corn", 30);

        // Assign the first product as the lowest price initially
        Products lpp = product1;

        // Compare with product2 and update if necessary
        if (product2.price < lpp.price) {
            lpp = product2;
        }

        // Compare with product3 and update if necessary
        if (product3.price < lpp.price) {
            lpp = product3;
        }

        // Display the product with the lowest price
        System.out.println("Product with the lowest price:");
        lpp.displayProduct();
    }
}
