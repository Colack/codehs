import java.util.Scanner;

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cost of the t-shirt: ");
        int cost = scanner.nextInt();
        System.out.println("The t-shirt costs $" + cost);
        cost++;
        System.out.println("A personalized t-shirt costs $" + cost);
        cost--;
        System.out.println("Without personalization, the t-shirt costs $" + cost);
    }
}
