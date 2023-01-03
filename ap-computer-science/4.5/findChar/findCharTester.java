public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }
    
    public static boolean findChar(String string, String key)
    {
        int index = 0;
        String character;
        while (true) {
            character = string.substring(index,index+1);
            if (character.equals(key)) {
                return true;
            }
            index++;
        }
        return false;
    }
}
