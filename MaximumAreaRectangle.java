{
//Initial Template for Java
import java.io.*;
import java.util.*;
// Pair class
class Rectangle{
    int length;
    int breadth;
    
    // Constructor
    public Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }
    
    // Funtion to find area
    public int area(){
        return (this.length*this.breadth);
    }
}
//Position this line where user code will be pasted.
// Driver class with main function
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Rectangle arr[] = new Rectangle[N];
		    
		    // Taking input length and breadth
		    for(int i = 0;i<N;i++){
		        int length = sc.nextInt();
		        int breadth = sc.nextInt();
		        arr[i] = new Rectangle(length, breadth);
		    }
		    
		    maxArea obj = new maxArea();
		    System.out.println(obj.calculate_Area(arr));
		    
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Class maxArea to calculate Area of rectangles
* arr : array containing rectangles
* calculate_Area : function to calculate area
* and return the maximum area
*/
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
       int max=arr[0].length*arr[0].breadth;
       for(int i=0;i<arr.length;i++){
           int area=arr[i].length*arr[i].breadth;
           if(area>max){
               max=area;
           }
       }
    return max;
}
}
