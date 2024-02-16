public class ChessBoard
{
    public static void main(String[] args)
    {
        String[][] chess = {
            {
                "Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"
            }, 
            {
                "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"
            }, 
            {
                "-", "-", "-", "-", "-", "-", "-", "-"
            },
            {
                "-", "-", "-", "-", "-", "-", "-", "-"
            },
            {
                "-", "-", "-", "-", "-", "-", "-", "-"
            },
            {
                "-", "-", "-", "-", "-", "-", "-", "-"
            },
            {
                "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"
            },
            {
                "Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"
            }
        };

        print(chess);
    }
    
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}