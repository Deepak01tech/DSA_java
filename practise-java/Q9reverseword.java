import java.util.*;
// Reverses the order of words while normalizing whitespace.
public class Q9reverseword{
    // Splits the input, then appends words from right to left.
    static String reversewords(String s)
    {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            if(i !=0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "i love java";
        System.out.println(reversewords(s));
    }
}