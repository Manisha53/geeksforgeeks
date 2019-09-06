//------------------------------my code-------------------
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean isprime(long n){
        boolean flag=true;
        if(n==1) flag=false;
        for(long i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }
    

    
	public static void main (String[] args) {
		//code
		Scanner in =new Scanner(System.in);
		long t=in.nextLong();
		while(t-->0){
		    long n=in.nextLong();
		    String flag="";
		    if(n==1){
		        System.out.println("No");
		    }
		    if(n==2){
		        System.out.println("No");
		    }
		    else if(n>2){
		        if(n%2==0){
		            System.out.println("Yes");
		        }
		        else{
		            flag=isprime(n-2)?"Yes":"No";
		            System.out.println(flag);
		        }
		    }
		    
		}
	}
}
