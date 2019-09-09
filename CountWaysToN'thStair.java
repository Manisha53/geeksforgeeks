import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int m = sc.nextInt();
		    
		    DynamicProgramming obj = new DynamicProgramming();
		    
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
//-----------------------------------my code------------------------------
}
/*This is a function problem.You only need to complete the function given below*/
class DynamicProgramming{
    
    // function to find number of ways 
    Long countWays(int m){
        
        // your code here
        long c=m/2;
        return c+1;
        
    }    
    
    
}
