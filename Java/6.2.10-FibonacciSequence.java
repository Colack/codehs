public class Fibonacci 
{
    public static void main(String[] args) 
    {

		int max = 15;

		int[] sequence = new int[15];
		
		sequence[0] = 0;
		sequence[1] = 1;
		
		
	    for (int i = 2; i < max; i++)
	    {
	        sequence[i] = sequence[i - 1] + sequence[i - 2];
	    }
		
		
		System.out.println("The first 15 elements in the Fibonacci sequence are: ");
		
		for (int i = 0; i < sequence.length; i++)
		{
		    System.out.print(sequence[i] + " ");
		}
    
        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));
    
    }

    public static int findNextElement (int[] arr, int toFind) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == toFind)
            {
                if (arr.length + 1 >= i) return arr[i + 1];
            }
        }
        return -1;
    }
}