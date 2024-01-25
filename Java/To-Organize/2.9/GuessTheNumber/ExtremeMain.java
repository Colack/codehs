import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Extremes extreme = new Extremes();
      
        int x = scanner.nextInt();

        int y = extreme.maxQuotient(x);
        System.out.println("You'd need to multiply your number by " + y + " to reach the max value!");

        int z = scanner.nextInt();

        int a = extreme.minQuotient(z);
        System.out.println("You'd need to multiply your number by " + a + " to reach the min value!");

    }
}
