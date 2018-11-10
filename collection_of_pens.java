import java.lang.*;
import java.io.*;
class GFG
 {
    static boolean isPrime(int num){
        int flag = 0;
        for(int i = 2;i < num/2;i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return true;
            }
            return false;
    }
    
    static int penCollection(int[] arr){
        int sum = 0;
        int j = 1;
        int k = 1;
        for(int i = 0;i < 2;i++){
            sum = sum + arr[i];
        }
        while(sum > 0){
            sum = sum + k;
            if(isPrime(sum)){
                return j;
            }
            j++;
        }
        
        return 0;
    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-- > 0){
	    int[] arr = new int[2];
	    for(int i = 0;i < 2;i++){
	        arr[i] = sc.nextInt();
	    }
	    System.out.println(penCollection(arr));
	 }
	}
}