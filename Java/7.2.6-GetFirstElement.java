import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        
        System.out.println(numbers.get(0));
    }
}