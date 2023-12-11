public class StringTrace
{
    public static void main(String[] args)
    {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";
        
        // String 1 is set to String 2, or "Karel"
        if (str1 == null)
        {
            str1 = str2;
        }
        
        // String 1 is compared to String 2, which is equal.
        if (str1 == str2)
        {
            System.out.println("str1 and str2 refer to the same object");
        }
        
        // String 2 is compared to String 3, and since String 3 is not an Object, but an actual string,
        // They are not equal.
        if (str2 == str3)
        {
            System.out.println("str2 and str3 refer to the same object");
        }
        
        // String 1 gets the actual string value of it compared to String 2,
        // And String 2 gets the actual string value of it copmared to String 3.
        // This is an and statement, and is equal.
        if (str1.equals(str2) && str2.equals(str3))
        {
            System.out.println("str1, str2, and str3 are equal");
        }
        
        // Just like 'str2 == str3', this is not comparing the actual values, but the object values.
        // They are not equal in this and statement.
        if ((str1 == str2) && (str2 == str3))
        {
            System.out.println("str1, str2, and str3 are the same objects");
            
        }
        
    }
}
