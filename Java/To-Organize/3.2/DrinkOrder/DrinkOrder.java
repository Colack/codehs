import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What do you want to drink?");
        String type = scanner.nextLine();
        
        System.out.println("How many teaspoons of sugar do you want?");
        int sugar = scanner.nextInt();
        
        System.out.println();
        
        System.out.println("Confirming your order. You wanted:");
        
        if (sugar == 0) {
            System.out.println(type);
        } else {
            System.out.println(type + " with sugar");
        }
    }
}
