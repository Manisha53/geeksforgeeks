//-------------my code---------------------
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String isprime(int n){
        String flag="Yes";
        //if(n==1) flag="No";
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag="No";
            }
        }
        return flag;
    }
    
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    if(n==1) System.out.println("No");
		    if(n==2) System.out.println("Yes");
		    else{
		        String ans=isprime(n);
		    System.out.println(ans);
		}
		}
	}
}
