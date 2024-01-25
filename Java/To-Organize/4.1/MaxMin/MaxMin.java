import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int smallest = 1000;
        int largest = 0;
        
        while (true) {
            System.out.println("Enter a number or 0 to quit: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num <= smallest) {
                smallest = num;
            }
            if (num >= largest) {
                largest = num;
            }
            System.out.println("Results so far:");
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
    }
}
