/*package whatever //do not write package name here */
//------------------------------my code-----------------------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static boolean prime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int m=in.nextInt();
		    int n=in.nextInt();
		    
		    if(m==1) m++; 
		    if(m==2){
		        System.out.print(2+" ");
		        m++;
		    }
		    for(int i=m;i<=n;i++){
		        if(prime(i)){
		            System.out.print(i+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
