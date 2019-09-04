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
		    int n=in.nextInt();
		    char s[][]=new char[n][n];
		   int ascii=65;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if(i==0 || i== n-1){
		                s[i][j]=(char)ascii;
		                ascii++;
		            }
		            else if(j==0 && (i>0 && i<n-1)){
		                s[i][j]=(char)ascii;
		                ascii++;
		            }
		            else if(j==n-1 &&(i>0 && i<n-1)){
		                s[i][j]=(char)ascii;
		                ascii++;
		            }
		            else{
		                s[i][j]='$';
		            }
		        }
		    }
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            System.out.print(s[i][j]);
		        }
		        System.out.println();
		    }
		   // System.out.println();
		}
	}
}
