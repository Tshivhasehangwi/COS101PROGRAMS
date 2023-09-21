import java.util.Scanner;

public class Interest2 {

    public static void main(String[] args) {

        double principal;  // The value of the investment.
        double rate;       // The annual interest rate.
        double interest;   // The interest earned during the year.

        Scanner kbreader = new Scanner(System.in);

        System.out.print("Enter the initial investment: ");
        principal = kbreader.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        rate = kbreader.nextDouble();

        interest = principal * rate;       // Compute this year's interest.
        principal = principal + interest;  // Add it to principal.

        System.out.println("The amount of interest: R" + interest);
        System.out.printf("The value after one year is R%1.2f%n ", principal);

    } //end of main()

} // end of class