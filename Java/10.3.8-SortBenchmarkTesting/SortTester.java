import java.util.ArrayList;

public class SortTester {

    public static void main(String[] args) {
        int[] testArray;
        long startTime, endTime;
        int arraySize = 20000;
        
        int[] bench = makeRandomArray(100);

        double start = System.currentTimeMillis();
        
        Sorter.selectionSort(bench);

        double end = System.currentTimeMillis();
        
        System.out.println("Selection Sort: " + (end - start));
        
        bench = makeRandomArray(100);
        start = System.currentTimeMillis();
        
        Sorter.insertionSort(bench);

        end = System.currentTimeMillis();
        
        System.out.println("Insertion Sort: " + (end - start));
        
        bench = makeRandomArray(100);
        start = System.currentTimeMillis();
        
        Sorter.mergeSort(bench, bench.length);

        end = System.currentTimeMillis();
        
        System.out.println("Merge Sort: " + (end - start));
    }

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);

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