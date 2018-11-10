
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
        int c=0,j=1;
        int arr[]=new int[6001];
        while(c<6001){
            if(checkPrime(j)){
                arr[c++]=j;
            }
            j++;
        }
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            long res=0;
            int n=in.nextInt();
            res=((arr[n])+1)*n;
            System.out.println(res);
        }
	}
}