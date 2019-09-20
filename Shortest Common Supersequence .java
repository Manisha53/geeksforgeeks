//-----------------------------my code---------------------------------

//----------------using DP------------------------
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
		  String s1=in.next();
		  String s2=in.next();
		  
		  int l1=s1.length();
		  int l2=s2.length();
		  int l=0;
		  
		  int[][] dp=new int[l1+1][l2+1];
		  
		  for(int i=0;i<=l1;i++){
		      for(int j=0;j<=l2;j++){
		          
		          if(i==0 || j==0){
		              dp[i][j]=0;
		          }
		          
		        else if(s1.charAt(i-1)==s2.charAt(j-1)){        //since string indices start from 0 index
		              dp[i][j]=1+dp[i-1][j-1];                    
		          }
		          else{
		              dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		          }
		      }
		  }
		  l=dp[l1][l2];
		 // System.out.println(l);
		  System.out.println(l1+l2-l);
		}
	
	}
}
