public class TicTacToe
{
   private int turn;
   private String[][] board;
    
    public TicTacToe()
    {
        this.board = new String[][] {
            { "-", "-", "-" },
            { "-", "-", "-" },
            { "-", "-", "-" }
        };
    }

   public int getTurn()
   {
       return this.turn;
   }
   
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for (int i = 0; i < 3; i++)
       {
           System.out.print(i + " ");
           for (int j = 0; j < 3; j++) 
           {
               System.out.print(board[i][j] + " ");
           }
           System.out.println();
       }
   }

   public boolean pickLocation(int row, int col)
   {
       if(board[row][col].equals("-"))
       {
           return true;
       }
       return false;
   }

   public void takeTurn(int row, int col)
   {
       if(!pickLocation(row, col)) return;
       if(turn % 2 == 0)
       {
           this.board[row][col] = "X";
       }
       else
       {
           this.board[row][col] = "O";
       }
       this.turn++;
   }

   public boolean checkRow()
   {
       for(String[] row : this.board)
       {
           if(row[0].equals(row[1]) && row[1].equals(row[2]) && !row[0].equals("-"))
           {
               return true;
           }
       }
       return false;
   }
   

   public boolean checkCol()
   {
       for (int i = 0; i < board.length; i++)
       {
           if(board[0][i].equals("O") || board[0][i].equals("X"))
           {
               if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
               {
                   return true;
               }
           }
       }
       return false;
   }
   
   public boolean checkDiag()
   {
        if(board[0][0].equals("O") || board[0][0].equals("X"))
        {
            if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            {
                return true;
            }
            if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
            {
                return true;
            }
        }
        return false;
   }

   public boolean checkWin()
   {
       if(checkRow() || checkCol() || checkDiag())
       {
           return true;
       }
       return false;
   }
}