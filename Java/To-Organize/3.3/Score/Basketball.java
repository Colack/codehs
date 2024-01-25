import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String one = scanner.nextLine();
        
        String two = scanner.nextLine();
        
        int onee = scanner.nextInt();
    
        int twoo = scanner.nextInt();
        
        int compare = one.compareTo(two);
        
        if (compare < 0) {
            System.out.println(one + " scored " + onee + " points");
            System.out.println(two + " scored " + twoo + " points");
        } else {
            System.out.println(two + " scored " + twoo + " points");
            System.out.println(one + " scored " + onee + " points");
        }
        
        if (onee > twoo) {
            System.out.println(one + " wins!");
        } else {
            System.out.println(two + " wins!");
        }
        
        
        
    }
}
