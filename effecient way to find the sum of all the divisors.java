
// Formula based Java program to  
// find sum of all divisors of n. 
  
import java.io.*; 
import java.math.*; 
public class GFG{ 
      
    // Returns sum of all factors of n. 
    static int sumofFactors(int n) 
    { 
        // Traversing through all prime factors. 
        int res = 1; 
        for (int i = 2; i <= Math.sqrt(n); i++) 
        { 
      
              
            int count = 0, curr_sum = 1; 
            int curr_term = 1; 
              
            while (n % i == 0)  
            { 
                count++; 
      
                // THE BELOW STATEMENT MAKES 
                // IT BETTER THAN ABOVE METHOD  
                // AS WE REDUCE VALUE OF n. 
                n = n / i; 
      
                curr_term *= i; 
                curr_sum += curr_term; 
            } 
      
            res *= curr_sum; 
        } 
      
        // This condition is to handle  
        // the case when n is a prime  
        // number greater than 2 
        if (n > 2) 
            res *= (1 + n); 
      
        return res; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 30; 
        System.out.println(sumofFactors(n)); 
    } 
} 
  