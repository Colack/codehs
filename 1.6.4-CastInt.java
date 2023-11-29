import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a double: ");
        Double myDouble = scanner.nextDouble();
        
        System.out.println(myDouble);
        
        int myInt = myDouble.intValue();
        
        System.out.println(myInt);
        
        myDouble += 0.5;
        
        System.out.println(myDouble);
        
        myInt = myDouble.intValue();
        
        System.out.println(myInt);
        
    }
}
