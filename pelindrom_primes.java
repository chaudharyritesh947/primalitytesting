
// Java program to find next palindromic 
// prime for a given number. 
import java.lang.*; 
class Geeks { 
  
static boolean isPrime(int num) 
{ 
    if (num < 2 || num % 2 == 0) 
        return num == 2; 
    for (int i = 3; i * i <= num; i += 2) 
        if (num % i == 0) 
            return false; 
    return true; 
} 
  
static int primePalindrome(int N) 
{ 
    // if(8<=N<=11) return 11 
    if (8 <= N && N <= 11) 
        return 11; 
  
    // generate odd length palindrome number  
    // which will cover given constraint. 
    for (int x = 1; x < 100000; ++x) { 
      
        String s = Integer.toString(x); 
        StringBuffer buffer = new StringBuffer(s); 
        buffer.reverse(); 
          
        int y = Integer.parseInt(s +  
        buffer.substring(1).toString()); 
      
        // if y>=N and it is a prime number  
        // then return it. 
        if (y >= N && isPrime(y) == true) 
            return y; 
    } 
  
    return -1; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    System.out.print(primePalindrome(112)); 
  
} 
} 