package dsa;
import java.util.*;

public class binarysearch {

    static  int binarysearchh(int[]arr,int key)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right= n;
        while(left<=right)
        {
            int mid= (left+right)/2;
            if(arr[mid]==key)
            {
                return mid+1;
            }
            else if (arr[mid]<key)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
            
        }
        return 0;

    }
    public static void main(String[] args){
        System.out.println("binary search");
        int[] arr ={6,5,4,3,7,89,10};
        System.out.println(binarysearchh(arr,5));



    }
    
}
