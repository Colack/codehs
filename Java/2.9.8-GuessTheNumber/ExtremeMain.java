import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Extremes extreme = new Extremes();

        System.out.println("What is the maximum value of the number:");
        int maxGuess = input.nextInt();

        int q1 = extreme.maxQuotient(maxGuess);
        System.out.println("You'd need to multiply your number by " + q1 + " to reach the max value!");

        System.out.println("What is the maximum value of the number:");
        int minGuess = input.nextInt();

        int q2 = extreme.minQuotient(minGuess);
        System.out.println("You'd need to multiply your number by " + q2 + " to reach the max value!");
    }
}