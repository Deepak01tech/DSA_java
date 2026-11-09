import java.util.*;
// Demonstrates palindrome checks using StringBuilder and two pointers.
public class Q2Checkpalindrome{
    // Builds the reversed string and compares it with the original.
    static boolean isPalindromesb(String s)
    {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);

    }

    // Compares characters from both ends until the center is reached.
    static boolean isPalindrometwopointer(String s )
    {
        int left =0,right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){

        String s = "naman";
        String s2= "delhi";
        System.out.println(isPalindromesb(s));
        System.out.println(isPalindrometwopointer(s2));
    }
}