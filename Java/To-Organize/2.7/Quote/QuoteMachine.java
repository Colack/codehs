import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String quote = scanner.nextLine();
        
        String author = scanner.nextLine();
        
        System.out.println(author);
        System.out.println("\"" + quote + "\"");
        System.out.println(author);
    }
}
