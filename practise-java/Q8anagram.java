import java.util.*;
// Checks whether two strings contain the same characters.
public class Q8anagram{
    // Compares the two strings after sorting their characters.
    static boolean anagramSort(String a,String b)
    {
        if(a.length() != b.length()) return false;
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y);
    }
    // Compares character frequencies for lowercase English letters.
    static boolean anagramFreq(String a,String b){
        if(a.length() != b.length())
        {

            return false;
        }
        int[] count =new int[26];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        for(int c:count)
        {
            if(c !=0)
            {
             return false;

            }
            return true;
        }

    }



    public static void main(String[] args){
        String a = "asdfgh";
        String b = "asdfgh";
        System.out.println(anagramSort(a,b));
    }
}