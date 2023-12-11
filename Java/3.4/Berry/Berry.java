import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial of the berry:");
        String letter = scanner.nextLine();
        char berry = letter.charAt(0);
        
        if (berry == 'E') {
            System.out.println("You ordered Elderberry");
        } else if (berry == 'G') {
            System.out.println("You ordered Gooseberry");
        } else if (berry == 'L') {
            System.out.println("You ordered Lingonberry");
        } else {
            System.out.println("Berry not recognized");
        }
    }
}
