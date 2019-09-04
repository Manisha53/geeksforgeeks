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
		    int c=0;
		    String s=in.next();                     //don't use nextLine() here
		    for(int i=0;i<s.length()-1;i++){
		        if(s.charAt(i)=='2' && s.charAt(i+1)=='1'){
		            c++;
		        }
		    }
		
		   System.out.println(c);
		}
	}
}
