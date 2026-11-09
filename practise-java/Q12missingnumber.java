import java.util.*;
// Finds the missing number in a sequence containing one omission.
public class Q12missingnumber{
    // Compares the expected sum with the sum of the provided values.
    static int missingSum(int[] arr)
    {
        int n = arr.length + 1;
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int x : arr) actual+=x;
        return expected - actual;


    }
    // XORs every expected value and array value to isolate the missing number.
    static int missingXOR(int[] arr)
    {
        int n = arr.length+1;
        int xor = 0;
        for(int i = 1;i<=n;i++) xor ^=i;
        for(int x : arr) xor ^= x;
        return xor;
    }
    public static void main(){
        int [] arr = {1,2,3,4,5,7};
        System.out.println(missingXOR(arr));
        System.out.println(missingSum(arr));


    }
}