import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t-->0){
	        int n=s.nextInt();
	        int[] a=new int[n];
	        
	        for(int i=0;i<n;i++){
	            a[i]=s.nextInt();
	        }
	        
	        int width=0;
	        int i=0,j=n-1;
	        while(i<n){
	            j=n-1;
	            while(a[i]>a[j]){    
	                j--;
	            }
	            width=j-i>width?j-i:width;
	            
	            i++;
	            
	        }
	        System.out.println(width);
	    }
	}
}
