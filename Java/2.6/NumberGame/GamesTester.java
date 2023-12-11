public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        // Square the number
        // Print it out
        double square = game.squareNumber();
        System.out.println(square);
        
        // Double the number
        // Print it out
        square = game.doubleNumber();
        System.out.println(square);
        
        // Square the number again
        // Print it out
        square = game.squareNumber();
        System.out.println(square);
        
        // Get the number and store the value
        // Print out your stored value
        square = game.getNumber();
        System.out.println(square);
        
        // Get the number again then store and print
        // the value
        square = game.getNumber();
        System.out.println(square);
        
    }
}
