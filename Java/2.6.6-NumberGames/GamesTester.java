public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        double num;

        num = game.squareNumber();

        System.out.println(num);

        num = game.doubleNumber();

        System.out.println(num);

        num = game.squareNumber();

        System.out.println(num);

        num = game.getNumber();

        System.out.println(num);

        num = game.getNumber();

        System.out.println(num);
        
    }
}