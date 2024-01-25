import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Enter the letter to be replaced: ");
        String letter1 = scanner.nextLine();
        
        System.out.println("Enter the new letter: ");
        String letter2 = scanner.nextLine();
        
        System.out.println("Result: " + replaceLetter(word, letter1, letter2));
    }
    
    public static String replaceLetter(String word1, String word2, String word3) {
       boolean found = false;
       for (int i = 0; i < word1.length(); i++) {
           if (word1.substring(i, i+1).equals(word2) && !found) {
               found = true;
           } else if (word1.substring(i, i+1).equals(word2) && found) {
               word1 = word1.substring(0, i) + word3 + word1.substring(i+1);
           }
       }
       return word1;
    }
}
