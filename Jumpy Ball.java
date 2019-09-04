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
		    long res=0;
		    long h=in.nextLong();
		    for(long i=0;i<h;i/=2){
		        res+=2*h;
		        h=h/2;
		       // System.out.println(h);
		    }
		    System.out.println(res);
		}
	}
}
