import java.util.*;

public class CompareSearch 
{
    public static void main(String[] args)
    {
        System.out.println("Table of comparison counts");
        System.out.println("Length\t\tBinary Search\tLinear Search");
        testArrayOfLength(10);
        testArrayOfLength(20);
        testArrayOfLength(50);
        testArrayOfLength(100);
        testArrayOfLength(4);
    }
    
    public static void testArrayOfLength(int length)
    {
        int[] arr = generateArrayOfLength(length);
        int index = (int)(Math.random() * length);
        int elem = arr[index];
        System.out.println(length + "\t\t" + binarySearch(arr, elem) + "\t\t" + linearSearch(arr, elem));
    }
    
    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
    
    public static int binarySearch(int[] array, int number)
    {
        int low = 0;
        int high = array.length - 1;

        int counter = 0;
        
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == number)
            {
                counter++;
                return counter;
            }
            else if(array[mid] < number)
            {
                counter++;
                low = mid + 1;
            }
            else
            {
                counter++;
                high = mid - 1;
            }
        }
      
        return -1;
    }
    
    public static int linearSearch(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                return i + 1;
            }
        }
        return -1;
    }
}