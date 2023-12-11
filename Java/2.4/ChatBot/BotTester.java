import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! What is your name? ");
        
        String newName = scanner.nextLine();
        
        Bot person = new Bot(newName);
        
        person.greeting();
        
        person.help();
        
        newLine();
        
        System.out.println("Tell me Bot, which countries use the imperial system?");
        
        person.imperialCountries();
        
        newLine();
        
        System.out.println("Tell me Bot, what was the first computer bug?");
        
        person.firstBug();
        
        newLine();
        
        person.goodbye();
        
    }
    
    public static void newLine() {
        System.out.println();
    }
}
