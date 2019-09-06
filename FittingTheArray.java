//----------------------------------my code--------------------------
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
		    int counter=0;
		    int n=in.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++){      //a
		        a[i]=in.nextInt();
		    }
		     for(int i=0;i<n;i++){      //b
		        b[i]=in.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    for(int i=0;i<n;i++){
		        if(a[i]<=b[i]){
		            counter++;
		        }
		    }
		    if(counter==n){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
