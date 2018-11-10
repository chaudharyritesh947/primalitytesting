
# Python code to find  count of numbers having prime number  
# of set bits in their binary representation in the range  
# [L, R] 
  
# function to create an array of prime  
# numbers upto number 'n' 
def SieveOfEratosthenes(n): 
  
    # Create a boolean array "prime[0..n]" and initialize 
    # all entries it as true. A value in prime[i] will 
    # finally be false if i is Not a prime, else true. 
    prime = [True for i in range(n+1)] 
    p = 2
    while(p * p <= n): 
  
        # If prime[p] is not changed, then it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, n+1, p): 
                prime[i] = False
        p += 1
    lis = [] 
      
    # append all the prime numbers to the list 
    for p in range(2, n): 
        if prime[p]: 
            lis.append(p) 
    return lis 
  
# utility function to count the number of set bits 
def setBits(n): 
    return bin(n)[2:].count('1') 
  
# driver program 
if __name__ == "__main__": 
    x, y = [4, 8] 
    count = 0
    primeArr = SieveOfEratosthenes(y) 
    for i in range(x, y+1): 
        temp = setBits(i) 
        if temp in primeArr: 
            count += 1
    print(count) 