import java.util.Scanner;

public class PickupWindow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);

        System.out.println("Enter label: ");
        String customerOrder = input.nextLine();

        String combo = customerOrder.substring(0, 1);
        
        Integer comboNumber =  Integer.valueOf(combo);

        System.out.println("Customer ordered number " + comboNumber);
    }
}