import java.util.Scanner;

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cost=0;
        
        System.out.print("Please enter the cost of the t-shirt: $");
        cost = input.nextInt();
        System.out.println("The t-shirt costs $" + cost);
        cost++;
        System.out.println("A personalized t-shirt costs $" + cost);
        cost--;
        System.out.println("Without personalization, the t-shirt costs $" + cost);
        // Start here!
    }
}