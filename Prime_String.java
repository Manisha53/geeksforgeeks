/*package whatever //do not write package name here */
//--------------------------------my code--------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int val=0;
		    int n=in.nextInt();
		  //  char a[]=new char[n];
		  //  for(int i=0;i<n;i++){
		  //      a[i]=in.next();
		  //  }
		  String s=in.next();
		    for(int i=0;i<n;i++){
		        val+=(int)s.charAt(i); 
		        }
		       
		       if(isprime(val)){
		           System.out.println("YES");
		       } 
		       else{
		           System.out.println("NO");
		       }
		    }
		}
	
	public static boolean isprime(int n){
	    boolean flag=true;
	    if(n==1) flag=false;
	    for(int i=2;i<=n/2;i++){
	        if(n%i==0){
	            flag=false;
	        }
	    }
	    return flag;
	}
	
}
