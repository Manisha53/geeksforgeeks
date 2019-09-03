import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int mul;
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int sum1=0;
		    int sum2=0;
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    for(int i=0;i<n/2;i++){
		        sum1+=a[i];
		    }
		    for(int i=n/2;i<n;i++){
		        sum2+=a[i];
		    }
		   mul=sum1*sum2; 
		   System.out.println(mul);
		}
	}
}
