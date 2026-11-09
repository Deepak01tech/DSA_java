import java.util.*;
// Finds the largest element using sorting and a single scan.
public class Q3Largestelement{
    // Tracks the largest value while scanning the array once.
    static int largestelement(int[] arr){
        int max= arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    // Sorts a copy so that the original array is not modified.
    static int largestelementsort(int[] arr)
    {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy[copy.length-1];
    }
    public static void main(String[] args){
        int [] arr = {1,4,3,6,789};
        System.out.println(largestelementsort(arr));
        System.out.println(largestelement(arr));




    }
}