
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		try {
		    Scanner scan = new Scanner(System.in);
            int testCases = scan.nextInt();
            int[] entries = new int[testCases];
            int lastIndexInput = 0;
            int i = 0, j;
    
            for(; i<testCases; i++) {
                entries[i] = scan.nextInt();
                lastIndexInput = Math.max(lastIndexInput, entries[i]); 
            }
    
            lastIndexInput = Math.min(lastIndexInput, 5000);
            int[] pn = new int[lastIndexInput];
            boolean isPrime;
    
            int primeCounter = 0;
    		for(i=2; primeCounter<lastIndexInput; i++) {
    		    isPrime = true;
    		    for(j = 2; j<=i; j++) {
    		        if(i!=j && i%j==0) {
    		            isPrime = false;
    		            break;
    		        }
    		    }
    		    if(isPrime) {
    		        pn[primeCounter++] = i;
    		    }
    		}
    		for(i=0; i<testCases; i++) { 
    		    int entryIndex = entries[i];
    		    int primeNumberAtIndex = pn[entryIndex - 1];
    		    long targetNumber = (long) Math.pow(primeNumberAtIndex, 2) + 1;
    		    System.out.println(targetNumber);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
	}
}