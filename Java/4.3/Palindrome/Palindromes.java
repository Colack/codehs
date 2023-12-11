import java.util.Scanner;
public class Palindromes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type in your text: ");
        String word = scanner.nextLine();
        
        if (isPalindrome(word)) {
            System.out.println("Your word is a palindrome!");
        } else {
            System.out.println("Not a palindrome :(");
        }
    }
    
    public static boolean isPalindrome(String text)
    {
        if (reverse(text).equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }
}
