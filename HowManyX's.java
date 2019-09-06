//-----------------------------------my code------------------
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
		    int x=in.nextInt();
		    int l=in.nextInt();
		    int u=in.nextInt();
		    int c=0;
		    
		    for(int i=l+1;i<u;i++){
		        int j=i;
		        while(j>0){
		            if(j%10 == x){
		                c++;
		            }
		            j=j/10;
		        }
		    }
		    System.out.println(c);
		    
		}
	}
}
