import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();

        WordGames game = new WordGames(word1);
        String test = game.scramble();

        System.out.println(test);

        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
    }
}