/Initial Template for Java
import java.io.*;
import java.util.*;
// Pair class
class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
//Position this line where user code will be pasted.
// Driver class with main function
class GFG 
//---------------------------------------------------------------
class custom_Compare{
    
    // Compare function
    static void sortPairs(Pair arr[], int N){
        
        // Your code here
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(arr[i].x>arr[j].x){
                int t1=arr[i].x;
                int t2=arr[i].y;
                arr[i].x=arr[j].x;
                arr[i].y=arr[j].y;
                arr[j].x=t1;
                arr[j].y=t2;
            }
            }
            
        }
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
