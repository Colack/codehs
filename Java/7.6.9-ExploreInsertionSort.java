import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        insertionSort(array1);
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;   
            while (j >= 0 && array[j] < current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}