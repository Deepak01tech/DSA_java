import java.util.*;
// Counts how often each character appears while preserving insertion order.
public class countfreqyinstr{
    // Stores character counts in a linked hash map and prints each entry.
    static void charFrequenccy(String s )
    {
        Map<Character,Integer> map = new  LinkedHashMap<>();
        for(char c :s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }

    public static void main(String[] args){
        charFrequenccy("asdfghjklsdfgasdfg");
        // System.out.println(s);
    }
}