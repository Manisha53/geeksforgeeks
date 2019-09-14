//-------------------------my code----------------------------------------------
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
		    int n=in.nextInt();
		    int c=0;
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    
		    for(int i=0;i<n-1;i++){
		        for(int j=i+1;j<n;j++){
		            
		            if((a[i]+a[j])%4 == 0){
		                c++;
		            }
		        }
		        }
		System.out.println(c);
		    }
		  
	}
}
