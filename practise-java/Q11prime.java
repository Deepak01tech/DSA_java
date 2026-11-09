import java.util.*;
// Demonstrates a basic trial-division primality check.
class Q11prime{
    // Tests divisors only up to the square root of the number.
    static boolean isPrimeTrial(int n)
    {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println()
    }
}