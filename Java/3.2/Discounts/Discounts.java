import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked?");
        int hours = scanner.nextInt();
        
        // Compute cost - $4.25
        double moneyOwn = 4.25 * hours;
        
        // If parked for more than 3 hours, apply 25% discount
        if (hours > 3) {
            double quarter = moneyOwn / 4;
            moneyOwn = moneyOwn - quarter;
        }
        
        // If cost is under $7, set cost to $7
        if (moneyOwn < 7) {
            moneyOwn = 7;
        }
        
        // Display the final cost
        System.out.println("You owe $" + moneyOwn);
        
    }
}
