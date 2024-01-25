public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        String firstHalf = word.substring(word.length() / 2);
        String secondHalf = word.substring(0, word.length() / 2);
         
        return firstHalf + secondHalf;
    }
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }

    
    public String bananaSplit(String insertChar, String insertText)
    {
        String separator = insertChar;
        int sepPos = word.indexOf(separator);
        return word.substring(0, sepPos) + insertText + word.substring(sepPos);
    }
    
    
    public String toString()
    {
        return "[" + word + "]";
    }
    
    
}
