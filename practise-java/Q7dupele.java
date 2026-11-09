import java.util.*;
// Identifies duplicate values in an array.
public class Q7dupele {
    // Uses a seen set and a duplicate set to retain unique duplicates.
    static Set<Integer> findduplicates(int[] arr){
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> dup = new LinkedHashSet<>();
        for(int n: arr)
        {
            if(!seen.add(n)) dup.add(n);

        }
        return dup;

    }
    public static void main(String[] args){
      int [] arr = {1,2,3,2,4,1};
        System.out.println(findduplicates(arr));
        // if order by first appearrance
        /*
        Set<Integer> res = new LinkedHashSet<>();
        for(int n:arr)
        {
        if(dup.contains(n))
        {
          res.add(n);
        }
        }
        System.out.println(res);

        */

    }

}