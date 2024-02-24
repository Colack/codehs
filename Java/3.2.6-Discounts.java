import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours were you parked? ");
        int hours = input.nextInt();
        double price;

        price = hours * 4.25;

        if (hours > 3) price = price * 0.75;

        if (price < 7) price = 7;

        System.out.println("You owe $" + price); 
    }
}