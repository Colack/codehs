import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many points did you score?  ");
        int points = input.nextInt();
        
        System.out.println("How many rebounds did you get? ");
        int rebounds = input.nextInt();
        
        System.out.println("How many assists did you have? ");
        int assists = input.nextInt();

        boolean morePoints = false;
        boolean moreRebounds = false;
        boolean moreAssists = false;
        
        if (points >= 10) morePoints = true;
        if (rebounds >= 10) moreRebounds = true;
        if (assists >= 10) moreAssists = true;
        
        System.out.println("You got 10 or more points: " + morePoints);
        System.out.println("You got 10 or more rebounds: " + moreRebounds);
        System.out.println("You got 10 or more assists: " + moreAssists);
    }
}