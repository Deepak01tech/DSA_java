import java.util.*;
// Demonstrates duplicate removal from arrays.
public class Q5removeduplicates{
    // Preserves first-seen order with a LinkedHashSet.
    static int[] removeDuplicates(int[] arr)
    {
        Set<Integer> set = new LinkedHashSet<>();
        for(int n:arr) set.add(n);
        int [] res = new int[set.size()];
        int i =0;
        for(int n :set) res[i++] = n;
        return res;

    }
    // Intended for a sorted array; writes each unique value into the same array.
    static int removeDUplicates(int[] arr){
        if(arr.length ==0) return 0;
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]! = arr[j])
            {
                j++;
                arr[j] = arr[i];

            }
        }
        return j+1;

    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,2,3,4,4,5,5,6,6};
        System.out.println(removeDuplicates(arr));

    }
}