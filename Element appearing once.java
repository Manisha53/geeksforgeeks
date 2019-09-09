//---------------------------my code-------------------------
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
		    ArrayList<Integer> a=new ArrayList<Integer>();
		    //ArrayList<Integer> c=new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        a.add(in.nextInt());
		    }
		     
		    for(int i=0;i<n;i++){
		        int val=Collections.frequency(a,a.get(i));
		        if(val==1){
		            System.out.println(a.get(i));
		            break;
		        }
		    }
		    
		    
		    
		}
	}
}
