import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a quote:");
        String quote = input.nextLine();
        
        System.out.println("Enter the author of the quote:");
        String author = input.nextLine();

        System.out.println(author + "\n\"" + quote + "\"\n" + author);
    }
}