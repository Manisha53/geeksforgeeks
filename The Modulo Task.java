/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    long n=in.nextLong();
		    if(n%2==0){
		        System.out.println(n/2+1);
		    }
		    else{
		        System.out.println((n+1)/2);
		    }
		}
	}
}
