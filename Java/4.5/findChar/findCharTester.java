public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        String word = "Sussy Imposter";
        String key = "e";
        System.out.println("The character "+ key+ " is in the String '"+ word + "': " + findChar(word, key));
    }
    
    public static boolean findChar(String string, String key)
    {
        String character;
        for (int i = 0; i < string.length(); i++) {
            character = string.substring(i,i+1);
            if (character.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
