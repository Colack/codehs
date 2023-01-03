import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a password: ");
        String word = scanner.nextLine();
        
        boolean bool = passwordCheck(word);
        
        System.out.println(bool);
    }
    
    public static boolean passwordCheck(String password)
    {
        if (password == null) {
            return false;
        }
        if (password.length() < 8) {
            return false;
        }
        int len = password.length();
        for (int i = 0; i < len; i++) {
            if ((Character.isLetterOrDigit(password.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
