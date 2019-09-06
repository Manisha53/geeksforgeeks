//-----------------------------my code-----------------
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    long p= (long)Math.pow(2,31);
		    long n=in.nextInt();
		    long sum=0;
		    for(int i=0;i<32;i++){
		        
		        long c=n%2;
		        sum+=p*c;
		        p=p/2;
		        n=n/2;
		    }
		    System.out.println(sum);
		}
		    
	}
}
