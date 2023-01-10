import java.util.Scanner;
public class TeenTester
{
    public static void main(String[] args)
    {
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        
        System.out.println(myFriend.teenTalk(message));
    }
}
