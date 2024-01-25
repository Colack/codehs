import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First Int: ");
        int int1 = scanner.nextInt();
        
        System.out.println("Second Int: ");
        int int2 = scanner.nextInt();
        
        Double myDouble = (double)int1 / (double)int2;
        
        System.out.println(myDouble);
    }
}
