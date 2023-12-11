import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String sentence = scanner.nextLine();
        
        System.out.println(useProperGrammar(sentence));
    }
    
    public static String useProperGrammar(String theText)
    {
        int count = 0;
        for (int i = 0; i < theText.length(); i++) {
            if (theText.charAt(i) == '2') {
                count++;
            }
        }
        theText = theText.replace("2", "to");
        
        System.out.println("Fixed " + String.valueOf(count) + " grammatical errors:");
        return theText;
    }
}
