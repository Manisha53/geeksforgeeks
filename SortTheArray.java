/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(SYstem.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    Arrays.sort(a);
		    for(int i=0;i<n;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}
