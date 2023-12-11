public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        int length = 9;
        int rows = 9;
        int spaces = 0;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            length--;
            spaces++;
            System.out.println();
        }
    }
}
