import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String n = input.nextLine();
        WordGames wordx = new WordGames(n);
        
        System.out.println(wordx.scramble());
        
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        
        
    }
}
