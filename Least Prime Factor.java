//---------------------------my code--------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int prime(int n){
        int flag=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=i;
                break;
            }
            
        }
       return flag;
    }
    public static boolean isprime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int res=1;
		while(t-->0){
		    int n=in.nextInt();
		    if(n>2){
		        System.out.print(1+" ");
		    }
		    for(int i=2;i<=n;i++){
		      if(isprime(i)){          //if number is prime
		          System.out.print(i+" ");
		      }
		      else{                      //if number is not prime
		          res=prime(i);
		          System.out.print(res+" ");
		      }
		    }
		    System.out.println();
		}
	}
}
