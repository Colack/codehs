import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many points did you score?");
        int points = scanner.nextInt();
        
        System.out.println("How many rebounds did you get?");
        int rebounds = scanner.nextInt();
        
        System.out.println("How many assists did you have?");
        int assists = scanner.nextInt();
        
        boolean x = points >= 10;
        boolean y = rebounds >= 10;
        boolean z = assists >= 10;
        
        System.out.print("You got 10 or more points: " + x);
        System.out.print("You got 10 or more rebounds: " + y);
        System.out.print("You got 10 or more assists: " + z);
    }
}
