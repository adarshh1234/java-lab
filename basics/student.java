package labexperiments;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input for marks
        System.out.println("Enter Marks for the following subjects:"); 
        System.out.print("PHYSICS: ");
        int phy = s.nextInt();
        System.out.print("CHEMISTRY: ");
        int che = s.nextInt();
        System.out.print("MATHS: ");
        int mat = s.nextInt();

        // Calculating total marks
        int total = phy + che + mat;

        // Checking eligibility conditions
        if (mat >= 60 && phy >= 50 && che >= 40 && total >= 200) {
            System.out.println("Eligible");
        } else if ((mat + phy) >= 150) {  // Alternative eligibility condition
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // Close scanner (Optional, but best practice)
        s.close();
    }
}
