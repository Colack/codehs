import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if (num1 > num2 && num1 < num3) {
            System.out.println("The median is " + num1);
        } else if (num2 > num3 && num2 < num1) {
            System.out.println("The median is " + num2);
        } else if (num3 > num1 && num3 < num2) {
            System.out.println("The median is " + num3);
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("The median is " + num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("The median is " + num2);
        }
    }
}
