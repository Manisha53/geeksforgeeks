/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void printFibonacciNumbers(int n) 
    { 
       long f1 = 0, f2 = 1, i; 
      
        if (n < 1) 
            return; 
      
        for (i = 1; i <= n; i++) 
        { 
            System.out.print(f2+" "); 
            long next = f1 + f2; 
            f1 = f2; 
            f2 = next; 
        } 
    }  
      
    // Driver Code 
    public static void main(String[] args)  
    { Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0){
        int n=in.nextInt();
        printFibonacciNumbers(n);
        System.out.println();
    }
        
    } 
}
