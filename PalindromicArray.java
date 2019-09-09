//------------------------------my code-----------------------------------
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
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    
		    int count = 0;
            int i = 0;
            int j=n-1;
            int iSum = a[i]; //Accumulate sum from left
            int jSum = a[j]; //Accumulate sum from right

            while(i<j)
            {
               if(iSum==jSum){
                   iSum=a[i+1];
                   jSum=a[j-1];
                   i++;
                   j--;
               }
               else if(iSum>jSum){
                   count++;
                   jSum+=a[j-1];
                   j--;
               }
               else{
                   count++;
                   iSum+=a[i+1];
                   i++;
               }
            }
            System.out.println(count);
        }
		    
	}
}
