import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = scanner.nextLine();
        
        System.out.println("Enter the title of the book: ");
        String title = scanner.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        String publisher = scanner.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        int year = scanner.nextInt();
        
        System.out.println(name + "." + title + ".");
        System.out.println(publisher + "," + year + ".");
    }
}
