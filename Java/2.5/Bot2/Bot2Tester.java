import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Hello! What is your name?");
        String playerName = scanner.nextLine();
       
        Bot2 bot = new Bot2(playerName);
       
        bot.greeting();
       
        System.out.println();
       
        System.out.println("What is your favorite animal?");
        String favorite = scanner.nextLine();
       
        bot.favoriteAnimal(favorite);
       
        System.out.println();
       
        System.out.println("If you could visit any place, where would you go?");
        String place = scanner.nextLine();
       
        bot.destination(place);
        
        System.out.println();
        
        System.out.println("What is your favorite number?");
        int number = scanner.nextInt();
        
        bot.favoriteNumber(number);
        
        System.out.println();
        
        bot.goodbye();
    
    }
}
