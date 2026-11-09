import java.util.*;
// Counts vowels and consonants in alphabetic characters.
public class Q10countvaandc{
    // Converts the text to lowercase before classifying each letter.
    static void countVowelsConsonants(String s )
    {
        int vowels = 0, consonants =0;
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z')
            {
                if("aeiou".indexOf(c)!=-1)vowels++;
                else consonants++;
            }
        }
        System.out.println("vowels:"+ vowels + ", consonants: "+ consonants);
    }
    public static void main(String[] args){
        String s = "a quick bronwn fox run over a lazy dog";
        countVowelsConsonants(s);
        


    }
}