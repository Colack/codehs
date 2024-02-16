public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe board = new TicTacToe();
        printBoard(board.getBoard());
    }
    
    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }
}