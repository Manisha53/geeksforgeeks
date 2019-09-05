/*package whatever //do not write package name here */
//---------------------------------my code------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static boolean isprime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }
    
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int rem=0;
		while(t-->0){
		    int even=in.nextInt();         //inout even number greater than 2
		    for(int i=3;i<=even/2;i++){
		        if(isprime(i)){
		            rem=even-i;
		            if(isprime(rem)){
		                System.out.println(i+" "+rem);
		                break;
		            }
		        }
		        
		    }
		}
	}
}
