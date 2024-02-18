import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        
        removeEvens(odds);
        
        for (int ele : odds)
        {
            System.out.println(ele);
        }
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        for(int i = 1; i < array.size(); i++)
        {
            if (array.get(i) == 2)
            {
                array.remove(i);
                i--;
            }
            if (array.get(i) % 2 == 0)
            {
                array.remove(i);
                i--;
            }
        }
    }
}