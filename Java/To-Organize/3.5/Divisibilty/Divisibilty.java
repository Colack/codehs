import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the dividend: ");
        int dive = scanner.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divi = scanner.nextInt();
        
        if (divi == 0) {
            System.out.println(dive + " is not divisible by " + divi + "!");
        } else if (dive % divi == 0) {
            System.out.println(dive + " is divisible by " + divi + "!");
        } else {
            System.out.println(dive + " is not divisible by " + divi + "!");
        }
    }
}
