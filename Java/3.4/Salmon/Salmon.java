import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter current month (Integer)");
        int month = scanner.nextInt();
        
        if (month >= 3 && month <= 6) {
            System.out.println("Spring spawning season");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Fall spawning season");
        } else {
            System.out.println("Not spawning season");
        }
    }
}
