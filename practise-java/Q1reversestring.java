import java.util.*;
// Demonstrates two ways to reverse a string.
public class Q1reversestring{
    // Reverses the character array by swapping characters from both ends.
    static String reversetwopointer(String s )
    {
        char[] arr = s.toCharArray();
        int left =0,right =arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return new String(arr);

    }

    // Uses StringBuilder's built-in reverse operation.
    static String reverseSB(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        // Test string used for both reversal methods.
        String s = "iam the deepak patel";


        System.out.println(reversetwopointer(s));
        System.out.println(reverseSB(s));

    }
}