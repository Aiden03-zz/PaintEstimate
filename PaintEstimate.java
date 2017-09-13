
import java.util.Scanner;

public class PaintEstimate {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userHeight = 12;
        int userWidth = 15;
        double userArea = 180.0;
        final double PAINT_NEEDED = 350;
        int ONE_GALLON_CANS = 1;

        System.out.println("Enter wall height (feet): ");
        userHeight = scnr.nextInt();

        System.out.println("Enter wall width (feet): ");
        userWidth = scnr.nextInt();

        System.out.println("Wall area: " + (double) userHeight * userWidth + " square feet");

        System.out.println("Paint needed: " + (userArea / PAINT_NEEDED) + " gallons");

        System.out.println("Cans needed: " + Math.round(userArea / PAINT_NEEDED) + " can(s)");

    }

}
