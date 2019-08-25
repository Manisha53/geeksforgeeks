/*package whatever //do not write package name here */
//NOT OPTIMISED
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	Scanner in =new Scanner(System.in);
		
		int t=in.nextInt();
		while(t-->0){
		    int c0=0,c1=0,c2=0;
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        switch(a[i]){
		            case 0:c0++;
		            break;
		            case 1:c1++;
		            break;
		            case 2:c2++;
		            break;
		        }
		    }
		  
		    for(int i=0;i<c0;i++){
		        System.out.print(0+" ");
		    }
		    for(int i=0;i<c1;i++){
		        System.out.print(1+" ");
		    }
		    for(int i=0;i<c2;i++){
		        System.out.print(2+" ");
		    }
		    System.out.println();
		}
	}
}
//A bit better
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	Scanner in =new Scanner(System.in);
		
		int t=in.nextInt();
		while(t-->0){
		    int c0=0,c1=0,c2=0;
		    int n=in.nextInt();
		   // int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        int a=in.nextInt();
		          switch(a){
		            case 0:c0++;
		            break;
		            case 1:c1++;
		            break;
		            case 2:c2++;
		            break;
		        }
		  
		    }
		    
		    for(int i=0;i<c0;i++){
		        System.out.print(0+" ");
		    }
		    for(int i=0;i<c1;i++){
		        System.out.print(1+" ");
		    }
		    for(int i=0;i<c2;i++){
		        System.out.print(2+" ");
		    }
		    System.out.println();
		}
	}
}
