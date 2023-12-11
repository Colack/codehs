import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();
        
        Hello person = new Hello(inputName);
        
        person.english();
        person.spanish();
        person.french();
    }
}

