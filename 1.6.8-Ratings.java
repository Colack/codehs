import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Movie rating (as a decimal)");
        Double rating = scanner.nextDouble();
        
        int rounded = (int) (rating + 0.5);
        System.out.println("Rating rounded: " + rounded);
       
    }
}
