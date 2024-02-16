import java.util.ArrayList;

public class SortTester {

    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 3};
        long startTime, endTime;
        int arraySize = 50000;
        double time = 0.0;

        // Random Array
        int[] random = makeRandomArray(100);
        time = testArray(random);
        System.out.println("Random Array: " + time);
        
        int[] partialSort = makeAlmostSortedArray(100);
        time = testArray(partialSort);
        System.out.println("Almost Sorted Array: " + time);
        
        int[] reversed = makeReverseArray(100);
        time = testArray(reversed);
        System.out.println("Reverse Array: " + time);
    }
    
    public static double testArray(int[] array) {
        double before = System.currentTimeMillis();
        Sorter.mergeSort(array, array.length);
        double after = System.currentTimeMillis();
        return after - before;
    }

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }

    public static int[] makeReverseArray(int number)
   {
       int[] array = new int[number];
       int counter = number;
       for(int i = 0; i < number; i++)
       {
           array[i] = counter;
           counter--;
       }
       return array;
   }

   public static int[] makeAlmostSortedArray(int number)
   {
       int[] array = new int[number];
       for(int i= 0; i < number; i++)
       {
           array[i] = i+1;
       }
       int temp = array[array.length-1];
       array[array.length-1] = array[array.length - 2];
       array[array.length - 2] = temp;
       return array;

   }
}