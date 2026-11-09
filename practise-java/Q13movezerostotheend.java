import java.util.*;
// Moves all zeroes to the end while retaining the order of other values.
public class Q13movezerostotheend{
    // Writes non-zero values first, then fills the remaining positions with zero.
    static void movizero(int[] arr)
    {
        int pos = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0) arr[pos++] = arr[i];
        }
        while(pos<arr.length) arr[pos++] = 0;
    }
    public static void main(String[] args){
        int [] arr ={0,2,0,4,1,0,9,7,0,5};
        System.out.println();
        movizero(arr);
        for(int a : arr) System.out.print(a+",");


    }
}