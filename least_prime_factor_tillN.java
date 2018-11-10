
// Java program to print the least prime factors 
// of numbers less than or equal to 
// n using modified Sieve of Eratosthenes 
  
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    public static void leastPrimeFactor(int n) 
    { 
        // Create a vector to store least primes. 
        // Initialize all entries as 0. 
        int[] least_prime = new int[n+1]; 
  
        // We need to print 1 for 1. 
        least_prime[1] = 1; 
  
        for (int i = 2; i <= n; i++) 
        { 
            // least_prime[i] == 0 
            // means it i is prime 
            if (least_prime[i] == 0) 
            { 
                // marking the prime number 
                // as its own lpf 
                least_prime[i] = i; 
  
                // mark it as a divisor for all its 
                // multiples if not already marked 
                for (int j = 2*i; j <= n; j += i) 
                    if (least_prime[j] == 0) 
                        least_prime[j] = i; 
            } 
        } 
  
        // print least prime factor of 
        // of numbers till n 
        for (int i = 1; i <= n; i++) 
            System.out.println("Least Prime factor of " + 
                               + i + ": " + least_prime[i]); 
    } 
    public static void main (String[] args) 
    { 
        int n = 10; 
        leastPrimeFactor(n); 
    } 
} 
  