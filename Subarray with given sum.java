/*
Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
		    
		    int n=in.nextInt();
		    int sum=in.nextInt();
		    int s[]=new int[n];
		    for(int i=0;i<n;i++){
		        s[i]=in.nextInt();
		    }
		    
		    int pos=0;
		     int ad=0;
		     int flag=0;
		    for(int i=0;i<n;i++){
		       ad+=s[i];
		       while(ad>sum){
		           ad-=s[pos];
		           pos++;
		       }
		       if(ad==sum){
		           flag=1;
		           System.out.println(pos+1 + " "+ (i+1) );
		          break;
		           
		       }
		        
		    
		    }
		    if(flag==0){
		        System.out.println(-1);
		    }
		    
	}
}
}
