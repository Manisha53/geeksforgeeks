//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	  int n=sc.nextInt();
    	  int arr[]=new int[n];
    	  for(int i=0;i<n;i++)
    	  {
    	      arr[i]=sc.nextInt();
    	  }
    	  Geeks obj=new Geeks();
    	   System.out.println(obj.countSumSubsets(arr,n));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

class Geeks{
    
    static int countSumSubsets(int arr[],int n)
    {
        

long pow_set_size =(long)Math.pow(2, n);
int counter, j;

int c=0;
for(counter = 0; counter <pow_set_size; counter++)
{
int s=0;
for(j = 0; j < n; j++)
{
if((counter & (1 << j)) > 0)
{s+=arr[j];}

}
if(s%2 == 0)
c++;

}
c--;
return c;
}
}
