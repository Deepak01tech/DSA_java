import java.util.*;
// Finds the second-largest value using sorting and a single pass.
public class Q4Secondlargest{
    // Keeps track of the largest and second-largest values.
    static int Secondlargestsinglepass(int[] arr){
        int largestelement = Integer.MIN_VALUE;
        int Secondlargestele = Integer.MIN_VALUE;
        for(int n : arr)
        {
            if(n>largestelement)
            {
                Secondlargestele = largestelement;
                largestelement = n;

            }
            else if(n>Secondlargestele && n!=largestelement)
            {
                Secondlargestele = n;
            }
        }

        return Secondlargestele;
    }

    // Sorts a copy and searches backward for a value below the largest.
    static int Secondlargestsort(int[] arr){
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int largest = copy[copy.length-1];
        for(int i =copy.length-2;i>=0;i--)
        {
            if(copy[i] != largest)
            {
                return copy[i];

            }


        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args){

        int[] arr = {5,4,3,6,7,8,5};
        System.out.println(Secondlargestsort(arr));
        System.out.println(Secondlargestsinglepass(arr));

    }


}