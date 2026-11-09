import java.lang.*;
import java.util.*;
// Demonstrates storing and retrieving values in a HashMap.
public class pcollections {

    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Rahul", 25);
        ages.put("priya", 22);
        ages.put("amit", 30);
        System.out.println(ages.get("priya"));
        System.out.println(ages.get("Priya"));

    }

}
