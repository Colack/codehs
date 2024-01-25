import java.util.Scanner;

public class TaffyTester {
    public static void main(String[] args) {
        System.out.println("Starting Taffy Timer");
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        while (temp <= 270) {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextInt();
            if (temp < 270) {
                System.out.println("The mixture isn't ready yet");
            }
        }
        System.out.println("Your taffy is ready for the next step!");
    }
}
