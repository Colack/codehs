public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        int reverseNum = 0;
        
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        
        String s = String.valueOf(reverseNum);
        
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
