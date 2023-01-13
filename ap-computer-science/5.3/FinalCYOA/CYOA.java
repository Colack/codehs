import java.util.Scanner;
import java.util.Random;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(); 
        System.out.println("JoJo Part 2 game");
        
        System.out.println("Options:    1 - Play    2 - Settings    3 - Exit");
        int menu = scanner.nextInt();
        
        if (menu == 1) {
            System.out.println("Options:    1 - Obtain Red stone    2 - Fight Pillar men    3 - Hang out with Caesar");
            int game = scanner.nextInt();
            if (game == 1) {
                System.out.println("You go on a journey and train to get the red stone of aja, and you complete it.\n\n\n");
                System.out.println("Good Job! You won! 🏆😃👍");
            } else if (game == 2) {
                System.out.println("Options:    1 - Fight Esidisi    2 - Fight Wamuu    3 - Fight Kars");
                int fight = scanner.nextInt();
                if (fight == 1) {
                    System.out.println("You fight Esidisi.");
                } else if (fight == 2) {
                    System.out.println("You fight Wamuu.");
                } else {
                    System.out.println("You fight Kars.");
                }
            } else {
                int ran = rand.nextInt(5);
                switch (ran) {
                    case 0:
                        System.out.println("You and Caesar play Monopoly.");
                        break;
                    case 1:
                        System.out.println("You and Caesar play Chess.");
                        break;
                    case 2:
                        System.out.println("You and Caesar play Exploding Kittens.");
                        break;
                    case 3:
                        System.out.println("You and Caesar play Clue.");
                        break;
                    case 4:
                        System.out.println("You and Caesar play Payday.");
                        break;
                }
            }
        } else if (menu == 2) {
            System.out.println("Settings menu");
        } else {
            System.out.println("Exiting....");
        }
    }
}
