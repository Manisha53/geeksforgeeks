{
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
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  String s=sc.nextLine();
    	  Geeks obj=new Geeks();
    	  obj.checkString(s);
    	   
    	 }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
         int c=0;
        
      
        int l=s.length();
       
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
               
            }
           else if(s.charAt(i)==' '){    //for any space in between the characters of a string
                continue;
            }
            else{
                c++;
            }
            
        }
       
       // System.out.print(v+" "+c);
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else if(c==v)
       System.out.print("Same");
        
        System.out.println();
    }
}
//Po
