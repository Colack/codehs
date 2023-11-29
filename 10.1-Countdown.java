import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter starting number:");
       
       int x = scanner.nextInt();
       System.out.println(countdown(x));
    }
    
    public static String countdown(int number)
    {
        if (number <= 0) {
            return "Blastoff!";
        }
        
        System.out.print(number + " ");
    
        return countdown(number-2);
    }
}
