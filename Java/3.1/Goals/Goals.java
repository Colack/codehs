import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for goal amount
        System.out.println("Enter your goal:");
        int goalAmount = scanner.nextInt();
        
        // Ask for actual amount
        System.out.println("Enter your actual amount:");
        int actualAmount = scanner.nextInt();
        
        System.out.print("Went over goal?");
        
        // Compare numbers by creating three booleans
        if (actualAmount > goalAmount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
        System.out.print("Did not meet goal?");
        
        if (actualAmount < goalAmount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
        System.out.print("Met goal exactly?");
        
        if (actualAmount == goalAmount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
        // Display results as instructed
        
    }
}
