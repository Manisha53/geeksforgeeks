
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
    	   String s=sc.next();
    	   Geeks obj=new Geeks();
    	   obj.follPatt(s);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int l=s.length();
        int cx=0;
       
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='x'){
                    cx++;
                }
                else if(s.charAt(i)=='y'){
                    cx--;
                    if(cx<0){
                        break;
                    }
                }
            }
            
       
        if(cx==0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
         
      
    }
}
