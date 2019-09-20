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
		    int win;
		    if(n%2==0){
		        win=1;   //tom wins
		    }
		    else{
		        win=0;      //jerry wins
		    }
		    System.out.println(win);
		}
	
}
}
