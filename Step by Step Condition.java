class Geeks {
	 static void isDivisibleByPrime (int n) 
	 {
             //Your code here
             if(n%11==0 && n%3==0 || n%11==0 && n%2==0 || n%11==0){
                 System.out.println("Eleven");
             }
             else if(n%3==0 || n%3==0 && n%2==0){
                 System.out.println("Three");
             }
             else if(n%2==0){
                 System.out.println("Two");
             }
             else{
                 System.out.println(-1);
             }
      // System.out.println();
	 }
}
/*
Example:
Input:
2
3
11

Output:
Three
Eleven

*/
